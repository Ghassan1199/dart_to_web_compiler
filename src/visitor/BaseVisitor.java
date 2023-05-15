package visitor;

import antlr.FlutterParser;
import antlr.FlutterParserBaseVisitor;
import ast.node.*;
import ast.node.Class;
import ast.program.Program;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileNotFoundException;
import java.util.*;


public class BaseVisitor extends FlutterParserBaseVisitor {




    public final SymbolTable symbolTable = new SymbolTable();

    public final VariableTable variableTable = new VariableTable();


    public static final Error errors = new Error();

    public final static List<Node> nodes = new ArrayList<>();
    public SemanticCheck semanticCheck;

    public CodeGeneration codeGeneration;


    @Override
    public OnChanged visitOnchanged(FlutterParser.OnchangedContext ctx) {
        if (ctx != null) {

            int lineNumber = ctx.start.getLine();

            OnChanged onChanged = new OnChanged(lineNumber);


            String variable = ctx.variable().getText();
            String parameter = ctx.id().getText();
            onChanged.setParameter(parameter);
            onChanged.setChild(variable.substring(0,variable.length() - 1 ));

            return onChanged;

        }
        return null;
    }

    @Override
    public Program visitProgram(FlutterParser.ProgramContext ctx) throws FileNotFoundException {
        Program program = new Program();
        for (int i = 0; i < ctx.import_f().size(); i++) {
            program.addChild(visitImport_f(ctx.import_f().get(i)));
        }
        for (int i = 0; i < ctx.function().size(); i++) {

            program.addChild(visitFunction(ctx.function().get(i)));
        }
        for (int i = 0; i < ctx.class_().size(); i++) {
            program.addChild(visitClass(ctx.class_().get(i)));
        }


        this.semanticCheck = new SemanticCheck(variableTable);

         semanticCheck.check();

         codeGeneration = new CodeGeneration(nodes);


        codeGeneration.generate();

        return program;
    }


    @Override
    public Button visitButton(FlutterParser.ButtonContext ctx) {
        if (ctx != null) {

            int lineNumber = ctx.start.getLine();

            Object onTap = visitButtonProperties(ctx.buttonProperties(0));
            Object child = visitButtonProperties(ctx.buttonProperties(1));

            this.symbolTable.setData("flutter class", "TextButton");


            Button button = new Button(lineNumber, onTap, child);
            nodes.add(button);
            return button;
        }
    return null;
    }

    @Override
    public Object visitButtonProperties(FlutterParser.ButtonPropertiesContext ctx) {
        if (ctx != null) {

          Object ot =  visitOn_tap(ctx.on_tap());
         Object c =   visitChild(ctx.child());

            if (ot != null) {
                return ot;
            }
            else {
                return c;
            }

        }
        return null;
    }

    @Override
    public InputDecoration visitInputDecoration(FlutterParser.InputDecorationContext ctx) {
        if (ctx != null) {
            this.symbolTable.setData("flutter class", "InputDecoration");

            int lineNumber = ctx.start.getLine();
            String hint = visitInputDecorationProperties(ctx.inputDecorationProperties(0));
            String border = visitInputDecorationProperties(ctx.inputDecorationProperties(1));
            if (hint != null) {
                return new InputDecoration(lineNumber, border, hint.substring(1, hint.length() - 1));

            }
            else {
                return new InputDecoration(lineNumber, border, hint);


            }

        }
        return null;
    }

    @Override
    public String visitInputDecorationProperties(FlutterParser.InputDecorationPropertiesContext ctx) {

        if (ctx != null) {

            Object border = visitBorder(ctx.border());
            String hint = visitHint(ctx.hint());

            List<String> l = new ArrayList<>();
            if (hint != null) {
                return hint;
            }
            else
            {
                return border.toString();

            }

        }

        return null;
    }

    @Override
    public TextField visitTextfield(FlutterParser.TextfieldContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();

            TextField textField = new TextField(lineNumber);

            textField.setChild(visitTextfieldproperties(ctx.textfieldproperties(0)).toString());
            textField.setChild(visitTextfieldproperties(ctx.textfieldproperties(1)));

            this.symbolTable.setData("flutter class", "TextFormField");

            nodes.add(textField);
            return textField;
        }
        return null;
    }

    @Override
    public List<Object> visitTextfieldproperties(FlutterParser.TextfieldpropertiesContext ctx) {
        if (ctx != null) {
             Object o = visitDecoration(ctx.decoration());
         OnChanged onChanged = visitOnchanged(ctx.onchanged());
             List<Object> ob = new ArrayList<>();
             ob.add(o);
            ob.add(onChanged);
             return ob;

        }
        return null;
    }

    @Override
    public Object visitDecoration(FlutterParser.DecorationContext ctx) {
        if (ctx != null) {

            return visitInputDecoration(ctx.inputDecoration());
        }
        return null;
    }

    @Override
    public Object visitBorder(FlutterParser.BorderContext ctx) {
        if (ctx != null) {

            return visitClass_call(ctx.class_call());
        }
        return null;
    }

    @Override
    public String visitHint(FlutterParser.HintContext ctx) {
        if (ctx != null) {
            return ctx.getChild(2).getText();
        }
        return null;
    }

    @Override
    public List<Object> visitMaterialPageRoute(FlutterParser.MaterialPageRouteContext ctx) {
        if (ctx != null) {

           return visitMaterialPageRouteProperities(ctx.materialPageRouteProperities());

        }
        return null;
    }

    @Override
    public List<Object> visitBuilder(FlutterParser.BuilderContext ctx) {
        if (ctx != null) {

           return visitClass_call(ctx.class_call());
        }
        return null;
    }

    @Override
    public List<Object> visitMaterialPageRouteProperities(FlutterParser.MaterialPageRouteProperitiesContext ctx) {

        if (ctx != null) {

           return visitBuilder(ctx.builder());
        }

        return null;
    }

    @Override
    public Object visitNavigator(FlutterParser.NavigatorContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();

            Navigator nav = new Navigator(lineNumber);
            List<Object> l = visitMaterialPageRoute(ctx.materialPageRoute());

           String goTO = l.get(0).toString();

           String strParams = l.get(1).toString();

           String[] raw = strParams.substring(1, strParams.length() - 1).split("\\,");

            nav.setGoTO(goTO);

            for (String s : raw) {
                nav.addData(s);
            }

            this.symbolTable.setData("flutter class", "Navigator");

            nodes.add(nav);

            return nav;
        }
        return null;
    }


    @Override
    public Function visitFunction(FlutterParser.FunctionContext ctx) {
        if (ctx != null) {

            //visitFunction_header(ctx.function_header());

            String[] functionHeader = visitFunction_header(ctx.function_header());

            int lineNumber = ctx.start.getLine();
            String funType = functionHeader[0];
            String funName = functionHeader[1];
            Pair<String, String> pair = new Pair<>("function", funName);
            if (Objects.equals(funName, "build") || !(this.symbolTable.getData().contains(pair))) {
                this.symbolTable.setData(pair);
            } else {
                errors.setError("function " + funName + " at line " + lineNumber + " already declared");
            }

            Function function = new Function(lineNumber, funType, funName);
            if (!(functionHeader[2] == null)) {
                String parameterType = functionHeader[2];
                String parameterName = functionHeader[3];
                function.addParameter(parameterType, parameterName);
            } else {

                function.addParameter(" None ", " None ");
            }

            List<Object> b = visitFunction_body(ctx.function_body());
            for (Object g : b) {
                function.addChild(g);
            }

            nodes.add(function);



            return function;

        }
        return null;
    }


    @Override
    public String[] visitFunction_header(FlutterParser.Function_headerContext ctx) {

        if (ctx != null) {
            String[] l = new String[4];
            l[0] = ctx.getChild(0).getText();
            l[1] = ctx.getChild(1).getText();

            if (!Objects.equals(ctx.getChild(3).getText(), ")")) {
                l[2] = ctx.getChild(3).getText();
                l[3] = ctx.getChild(4).getText();
            }


            return l;
        }
        return null;
    }

    @Override
    public List<Object> visitStructure(FlutterParser.StructureContext ctx) {
        if (ctx != null) {

            List<Object> l = new ArrayList<>();
            Return r = visitReturn(ctx.return_());
            RunApp rp = visitRun_app_call(ctx.run_app_call());
            Function f = visitFunction(ctx.function());
            Return o = visitOne_return(ctx.one_return());
            Variable v = visitVariable(ctx.variable());
            String or = visitOverride(ctx.override());
            VariableDeclaration vd = visitDecl(ctx.decl());
            Object cc = visitClass_call(ctx.class_call());
            Object fc = visitFlutter_classes(ctx.flutter_classes());
            Object vc = visitVariable_call(ctx.variable_call());
            //Object id = visitId(ctx.id());

            if (rp != null) {
                l.add(rp);
            }
            if (r != null) {
                l.add(r);
            }
            if (f != null) {
                l.add(f);
            }
            if (o != null) {
                l.add(o);
            }
            if (v != null) {
                l.add(v);
            }
            if (or != null) {
                l.add(or);
            }
            if (vd != null) {
                l.add(vd);
            }
            if (cc != null) {
                l.add(cc);
            }
            if (fc != null) {
                l.add(fc);
            }
            if (vc != null) {
                l.add(vc);
            }

            return l;
        }

        return null;
    }

    @Override
    public List<Object> visitFunction_body(FlutterParser.Function_bodyContext ctx) {

        List<Object> l = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount() - 2; i++) {

            l.add(visitStructure(ctx.structure(i)));

        }


        return l;
    }

    @Override
    public Object visitFunction_call(FlutterParser.Function_callContext ctx) {

        if (ctx != null) {

            return ctx.getChild(2).getText();
        }

        return null;
    }


    @Override
    public Return visitReturn(FlutterParser.ReturnContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            Object ob = visitFlutter_classes(ctx.flutter_classes());

            return new Return(lineNumber, ob);
        }
        return null;
    }

    @Override
    public Object visitNumbers(FlutterParser.NumbersContext ctx) {
        return null;
    }

    @Override
    public Object visitValues(FlutterParser.ValuesContext ctx) {
        return null;
    }

    @Override
    public String visitId(FlutterParser.IdContext ctx) {
        if (ctx != null) {

            return ctx.getText();
        }

        return null;
    }


    @Override
    public Return visitOne_return(FlutterParser.One_returnContext ctx) {

        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            Object ob = ctx.getChild(1).getText();

            return new Return(lineNumber, ob);
        }

        return null;
    }

    @Override
    public Object visitArgument(FlutterParser.ArgumentContext ctx) {
        return null;
    }

    @Override
    public Object visitVariable_call(FlutterParser.Variable_callContext ctx) {
        if (ctx != null) {
            return visitId(ctx.id());
        }
        return null;
    }

    @Override
    public Variable visitVariable(FlutterParser.VariableContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            String type = ctx.getChild(0).getText();
            String name = ctx.getChild(1).getText();
            String value = ctx.getChild(3).getText();


            if (Objects.equals(value, ";")) {
                this.variableTable.setData(type+","+name+",null");

            }
            else {
                this.variableTable.setData(type+","+name+","+value);

            }



            Pair<String, String> pair = new Pair<>("variable", type + "\t" + name);


                this.symbolTable.setData(pair);





            return new Variable(lineNumber, type, name, value);
        }


        return null;
    }


    @Override
    public VariableDeclaration visitDecl(FlutterParser.DeclContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            String type = ctx.getChild(0).getText();
            String name = ctx.getChild(1).getText();


            this.variableTable.setData(type+","+name+",null");



            Pair<String, String> pair = new Pair<>("variable", type + "\t" + name);


                this.symbolTable.setData(pair);



            return new VariableDeclaration(lineNumber, type, name);
        }

        return null;
    }

    @Override
    public Object visitInit(FlutterParser.InitContext ctx) {
        return null;
    }

    @Override
    public Object visitVariable_access(FlutterParser.Variable_accessContext ctx) {
        return null;
    }

    @Override
    public Object visitFunction_access(FlutterParser.Function_accessContext ctx) {
        return null;
    }

    @Override
    public Node visitClass(FlutterParser.ClassContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();

            String className = visitClass_header(ctx.class_header());

            Pair<String, String> pair = new Pair<>("class", className);
            if (this.symbolTable.getData().contains(pair)) {
                errors.setError("class " + className + " at line " + lineNumber + " already declared");

            } else {

                this.symbolTable.setData(pair);
            }
            String extendsTo = visitExtends_class(ctx.extends_class());
            Class cs = new Class(lineNumber, extendsTo, className);
            cs.addChild(visitClass_body(ctx.class_body()));

            this.nodes.add(cs);

            return cs;
        }
        return null;
    }


    @Override
    public String visitClass_header(FlutterParser.Class_headerContext ctx) {
        if (ctx != null) {
            return ctx.id().getText();
        }
        return null;
    }

    @Override
    public Object visitClass_body(FlutterParser.Class_bodyContext ctx) {
        if (ctx != null) {
            List<Object> l = new ArrayList<>();
            for (int i = 0; i < ctx.getChildCount() - 2; i++) {
                l.add(visitStructure(ctx.structure(i)));
            }
            return l;
        }
        return null;
    }

    @Override
    public Object visitClass_type(FlutterParser.Class_typeContext ctx) {
        return null;
    }

    @Override
    public String visitExtends_class(FlutterParser.Extends_classContext ctx) {
        if (ctx != null) {
            return ctx.id(0).getText();
        }
        return null;
    }

    @Override
    public Object visitClass_instance(FlutterParser.Class_instanceContext ctx) {
        return null;
    }

    @Override
    public List<Object> visitClass_call(FlutterParser.Class_callContext ctx) {
        if (ctx != null) {

            Object ss = visitSet_state(ctx.set_state());
            Object fc = visitFunction_call(ctx.function_call());
            List<Object> l = null;
            List<Object> o;
            String id = visitId(ctx.id());
            Object vp = visitParameters(ctx.parameters());
            if (id != null || vp != null) {
                l = new ArrayList<>();
                l.add(id);
                l.add(vp);
            }
            if (l != null) {
                return l;
            }
            if (ss != null) {
                o = new ArrayList<>();
                o.add(ss);
                return o;
            }
            if (fc != null) {
                o = new ArrayList<>();
                o.add(fc);
                return o;
            }
            else
            {

                return visitFlutter_classes(ctx.flutter_classes());
            }


        }
        return null;
    }


    @Override
    public Object visitList(FlutterParser.ListContext ctx) {
        return null;
    }

    @Override
    public Object visitList_decl(FlutterParser.List_declContext ctx) {
        return null;
    }

    @Override
    public Object visitNew_list(FlutterParser.New_listContext ctx) {
        return null;
    }

    @Override
    public Object visitList_values(FlutterParser.List_valuesContext ctx) {
        return null;
    }

    @Override
    public Object visitList_assignement(FlutterParser.List_assignementContext ctx) {
        return null;
    }

    @Override
    public Object visitList_value_call(FlutterParser.List_value_callContext ctx) {
        return null;
    }

    @Override
    public String visitOverride(FlutterParser.OverrideContext ctx) {
        if (ctx != null) {
            return ctx.getText();
        }
        return null;
    }

    @Override
    public Object visitParameters(FlutterParser.ParametersContext ctx) {
        if (ctx != null) {

            List<Object> l = new ArrayList<>();
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (!(Objects.equals(ctx.getChild(i).getText(), ","))) {
                    l.add(ctx.getChild(i).getText());

                }

            }
            return l;
        }

        return null;
    }

    @Override
    public Object visitFun(FlutterParser.FunContext ctx) {
        return null;
    }

    @Override
    public Object visitExpr(FlutterParser.ExprContext ctx) {
        return null;
    }

    @Override
    public Object visitExp(FlutterParser.ExpContext ctx) {
        return null;
    }

    @Override
    public Object visitComparison_operations(FlutterParser.Comparison_operationsContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_loop(FlutterParser.For_loopContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_header(FlutterParser.For_headerContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_body(FlutterParser.For_bodyContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_var_decl(FlutterParser.For_var_declContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_var_init(FlutterParser.For_var_initContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_var(FlutterParser.For_varContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_structure(FlutterParser.For_structureContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_each(FlutterParser.For_eachContext ctx) {
        return null;
    }

    @Override
    public Object visitFor_each_header(FlutterParser.For_each_headerContext ctx) {
        return null;
    }

    @Override
    public Object visitWhile(FlutterParser.WhileContext ctx) {
        return null;
    }

    @Override
    public Object visitWhile_header(FlutterParser.While_headerContext ctx) {
        return null;
    }

    @Override
    public Object visitDo_while(FlutterParser.Do_whileContext ctx) {
        return null;
    }

    @Override
    public Object visitIf(FlutterParser.IfContext ctx) {
        return null;
    }

    @Override
    public Object visitIf_header(FlutterParser.If_headerContext ctx) {
        return null;
    }

    @Override
    public Object visitElse_if(FlutterParser.Else_ifContext ctx) {
        return null;
    }

    @Override
    public Object visitElse(FlutterParser.ElseContext ctx) {
        return null;
    }

    @Override
    public Object visitTry_catch(FlutterParser.Try_catchContext ctx) {
        return null;
    }

    @Override
    public Object visitTry(FlutterParser.TryContext ctx) {
        return null;
    }

    @Override
    public Object visitCatche(FlutterParser.CatcheContext ctx) {
        return null;
    }

    @Override
    public Object visitFinaly(FlutterParser.FinalyContext ctx) {
        return null;
    }

    @Override
    public Object visitEnum(FlutterParser.EnumContext ctx) {
        return null;
    }

    @Override
    public Object visitThis(FlutterParser.ThisContext ctx) {
        return null;
    }

    @Override
    public FloatingActionButton visitFloatingactionbutton(FlutterParser.FloatingactionbuttonContext ctx) {

        if (ctx != null) {



            int lineNumber = ctx.start.getLine();

            Object onTap = visitFloatProperties(ctx.floatProperties(0));
            Object child = visitFloatProperties(ctx.floatProperties(1));

            this.symbolTable.setData("flutter class", "Floating Action Button");


            FloatingActionButton fab = new FloatingActionButton(lineNumber, onTap, child);
            nodes.add(fab);
            return fab;
        }
    return  null;
    }

    @Override
    public Object visitFloatProperties(FlutterParser.FloatPropertiesContext ctx) {
        if (ctx != null) {

            Object ot =  visitOn_tap(ctx.on_tap());
            Object c =   visitChild(ctx.child());

            if (ot != null) {
                return ot;
            }
            else {
                return c;
            }

        }
        return null;
    }

    @Override
    public List<Object> visitFlutter_classes(FlutterParser.Flutter_classesContext ctx) {
        if (ctx != null) {
            MaterialApp ma = visitMaterial_app_call(ctx.material_app_call());
            GestureDetector gd = visitGesture_detector(ctx.gesture_detector());
            Scaffold s = visitScaffold_call(ctx.scaffold_call());
            Row r = visitRow(ctx.row());
            Column cn = visitColumn(ctx.column());
            Container c = visitContainer(ctx.container());
            Text t = visitText(ctx.text());
            ListView lv = visitList_view(ctx.list_view());
            TextField tf = visitTextfield(ctx.textfield());
            InputDecoration id = visitInputDecoration(ctx.inputDecoration());
            Button b = visitButton(ctx.button());
           // FloatingActionButton fab = visitFloatingactionbutton(ctx.floatingactionbutton());

            List<Object> o = new ArrayList<>();
            if (ma != null) {
                o.add(ma);
            }
            if (gd != null) {
                o.add(gd);
            }
            if (s != null) {
                o.add(s);
            }
            if (r != null) {
                o.add(r);
            }
            if (c != null) {
                o.add(c);
            }
            if (cn != null) {
                o.add(cn);
            }
            if (t != null) {
                o.add(t);
            }
            if (lv != null) {
                o.add(lv);
            }
            if (tf != null) {
                o.add(tf);
            }
            if (id != null) {
                o.add(id);
            }
            if (b != null) {
                o.add(b);
            }
//            if (fab != null) {
//                o.add(fab);
//            }
            return o;
        }
        return null;
    }

    @Override
    public Object visitFlutter_functions(FlutterParser.Flutter_functionsContext ctx) {
        return null;
    }

    @Override
    public List<Object> visitChildren(FlutterParser.ChildrenContext ctx) {
        if (ctx != null) {


            List<Object> l = new ArrayList<>();
            for (int i = 0; i < ctx.getChildCount() - 1; i++) {
//                if (!(Objects.equals(ctx.getChild(i).getText(), ","))) {
//                    l.add(visitClass_call(ctx.class_call(i)));
//                }
                l.add(visitClass_call(ctx.class_call(i)));
            }

            return l;
        }
        return null;
    }

    @Override
    public Object visitChild(FlutterParser.ChildContext ctx) {
        if (ctx != null) {

            return visitClass_call(ctx.class_call());
        }

        return null;
    }

    @Override
    public Object visitColor(FlutterParser.ColorContext ctx) {
        if (ctx != null) {
            return ctx.getChild(4).getText();
        }

        return null;
    }

    @Override
    public Object visitHome(FlutterParser.HomeContext ctx) {
        return null;
    }

    @Override
    public Object visitBody(FlutterParser.BodyContext ctx) {
        if (ctx != null) {


            return visitClass_call(ctx.class_call());

        }
        return null;
    }

    @Override
    public Object visitWidth(FlutterParser.WidthContext ctx) {
        if (ctx != null) {
            return ctx.getChild(2).getText();
        }
        return null;
    }

    @Override
    public Object visitHeight(FlutterParser.HeightContext ctx) {
        if (ctx != null) {
            return ctx.getChild(2).getText();
        }
        return null;
    }

    @Override
    public Object visitMargin(FlutterParser.MarginContext ctx) {

        if (ctx != null) {

            return visitFunction_call(ctx.function_call());
        }
        return null;
    }

    @Override
    public String visitPadding(FlutterParser.PaddingContext ctx) {
        if (ctx != null) {

            return visitFunction_call(ctx.function_call()).toString();
        }
        return null;
    }

    @Override
    public Object visitOn_tap(FlutterParser.On_tapContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            OnTap ontap = new OnTap(lineNumber);
            Object o = visitNavigator(ctx.navigator());

            Object p = visitSet_state(ctx.set_state());

            if (o != null) {
                ontap.setChild(o);
            }
            return ontap;
        }
        return null;
    }

    @Override
    public RunApp visitRun_app_call(FlutterParser.Run_app_callContext ctx) {

        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            String child = ctx.getChild(2).getText();
            RunApp rp = new RunApp(lineNumber, child);


            this.symbolTable.setData("flutter function", "RunApp");

            return rp;
        }

        return null;

    }

    @Override
    public MaterialApp visitMaterial_app_call(FlutterParser.Material_app_callContext ctx) {
        if (ctx != null) {

            int lineNumber = ctx.start.getLine();
            String child = visitMaterial_app_properities(ctx.material_app_properities(0));


            this.symbolTable.setData("flutter class", "Material App");

            return new MaterialApp(lineNumber, child);
        }
        return null;
    }


    @Override
    public String visitMaterial_app_properities(FlutterParser.Material_app_properitiesContext ctx) {
        if (ctx != null) {
            return ctx.getChild(0).getChild(2).getText();
        }
        return null;

    }

    @Override
    public Scaffold visitScaffold_call(FlutterParser.Scaffold_callContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            Object child = visitScaffold_call_properities(ctx.scaffold_call_properities(0));
            FloatingActionButton  child2 = visitFloatingactionbutton(ctx.floatingactionbutton(0));


            this.symbolTable.setData("flutter class", "Scaffold");

            Scaffold scaffold = new Scaffold(lineNumber, child, child2);

                    nodes.add(scaffold);

            return scaffold ;
        }
        return null;
    }


    @Override
    public Object visitScaffold_call_properities(FlutterParser.Scaffold_call_properitiesContext ctx) {

        if (ctx != null) {

            return visitBody(ctx.body());
        }
        return null;

    }

    @Override
    public Row visitRow(FlutterParser.RowContext ctx) {
        if (ctx != null) {

            int lineNumber = ctx.start.getLine();
            List<Object> children = visitRow_properities(ctx.row_properities());
            Row row = new Row(lineNumber);
            if (children != null) {
                for (Object child : children) {
                    if (child != null) {
                        row.addChild(child);
                    }
                }
            }


            this.symbolTable.setData("flutter class", "Row");

            return row;

        }


        return null;
    }

    @Override
    public List<Object> visitRow_properities(FlutterParser.Row_properitiesContext ctx) {
        if (ctx != null) {

            return visitChildren(ctx.children());
        }

        return null;
    }

    @Override
    public Column visitColumn(FlutterParser.ColumnContext ctx) {
        if (ctx != null) {

            int lineNumber = ctx.start.getLine();
            List<Object> children = visitColumn_properities(ctx.column_properities());
            Column column = new Column(lineNumber);
            if (children != null) {
                for (Object child : children) {

                    if (child != null) {
                        column.addChild(child);
                    }


                }
            }


            this.symbolTable.setData("flutter class", "Column");
            nodes.add(column);
            return column;

        }
        return null;
    }


    @Override
    public List<Object> visitColumn_properities(FlutterParser.Column_properitiesContext ctx) {
        if (ctx != null) {
            return visitChildren(ctx.children());
        }
        return null;
    }

    @Override
    public Container visitContainer(FlutterParser.ContainerContext ctx) {
        if (ctx != null) {
            List<Object> l = new ArrayList<>();
            for (int i = 0; i < ctx.getChildCount(); i++) {

                l.add(visitContainer_properities(ctx.container_properities(i)));
            }
            //color
            //width
            //height
            //margin
            //child
            int lineNumber = ctx.start.getLine();
            String color = null;
            String width = null;
            String height = null;
            String margin = null;
            String child = null;
            if (l.get(0) != null) {

                if (l.get(0).toString().charAt(0) == '1') {
                    color = l.get(0).toString().substring(1);
                }
                if (l.get(0).toString().charAt(0) == '2') {
                    width = l.get(0).toString().substring(1);
                }
                if (l.get(0).toString().charAt(0) == '3') {
                    height = l.get(0).toString().substring(1);
                }
                if (l.get(0).toString().charAt(0) == '4') {
                    margin = l.get(0).toString().substring(1);
                }
                if (l.get(0).toString().charAt(0) == '5') {
                    child = l.get(0).toString().substring(1);
                }


            }
            if (l.get(1) != null) {
                if (l.get(1).toString().charAt(0) == '1') {
                    color = l.get(1).toString().substring(1);
                }
                if (l.get(1).toString().charAt(0) == '2') {
                    width = l.get(1).toString().substring(1);
                }
                if (l.get(1).toString().charAt(0) == '3') {
                    height = l.get(1).toString().substring(1);
                }
                if (l.get(1).toString().charAt(0) == '4') {
                    margin = l.get(1).toString().substring(1);
                }
                if (l.get(1).toString().charAt(0) == '5') {
                    child = l.get(1).toString().substring(1);
                }


            }
            if (l.get(2) != null) {

                if (l.get(2).toString().charAt(0) == '1') {
                    color = l.get(2).toString().substring(1);
                }
                if (l.get(2).toString().charAt(0) == '2') {
                    width = l.get(2).toString().substring(1);
                }
                if (l.get(2).toString().charAt(0) == '3') {
                    height = l.get(2).toString().substring(1);
                }
                if (l.get(2).toString().charAt(0) == '4') {
                    margin = l.get(2).toString().substring(1);
                }
                if (l.get(2).toString().charAt(0) == '5') {
                    child = l.get(2).toString().substring(1);
                }
            }

            if (l.get(3) != null) {

                if (l.get(3).toString().charAt(0) == '1') {
                    color = l.get(3).toString().substring(1);
                }
                if (l.get(3).toString().charAt(0) == '2') {
                    width = l.get(3).toString().substring(1);
                }
                if (l.get(3).toString().charAt(0) == '3') {
                    height = l.get(3).toString().substring(1);
                }
                if (l.get(3).toString().charAt(0) == '4') {
                    margin = l.get(3).toString().substring(1);
                }
                if (l.get(3).toString().charAt(0) == '5') {
                    child = l.get(3).toString().substring(1);
                }


            }
            if (l.size() == 5)
            {
                if (l.get(4) != null) {
                    if (l.get(4).toString().charAt(0) == '1') {
                        color = l.get(4).toString().substring(1);
                    }
                    if (l.get(4).toString().charAt(0) == '2') {
                        width = l.get(4).toString().substring(1);
                    }
                    if (l.get(4).toString().charAt(0) == '3') {
                        height = l.get(4).toString().substring(1);
                    }
                    if (l.get(4).toString().charAt(0) == '4') {
                        margin = l.get(4).toString().substring(1);
                    }
                    if (l.get(4).toString().charAt(0) == '5') {
                        child = l.get(4).toString().substring(1);
                    }
                }
            }

            this.symbolTable.setData("flutter class", "Container");
            Container container = new Container(lineNumber, child, width, height, margin, color);

            nodes.add(container);

            return container ;
        }
        return null;
    }

    @Override
    public Object visitContainer_properities(FlutterParser.Container_properitiesContext ctx) {
        Object temp = null;
        if (ctx != null) {

            Object w = visitWidth(ctx.width());
            Object ch = visitChild(ctx.child());
            Object c = visitColor(ctx.color());
            Object h = visitHeight(ctx.height());
            Object m = visitMargin(ctx.margin());


            if (c != null) {
                temp = "1 " + c;
            }
            if (w != null) {
                temp = "2 " + w;
            }
            if (h != null) {
                temp = "3 " + h;
            }
            if (m != null) {
                temp = "4 " + m;
            }
            if (ch != null) {
                temp = "5 " + ch;
            }

        }
        return temp;
    }

    @Override
    public ListView visitList_view(FlutterParser.List_viewContext ctx) {
        if (ctx != null) {

            int lineNumber = ctx.start.getLine();
            List<Object> children = visitChildren(ctx.children());
            String padding = visitPadding(ctx.padding());
            ListView listView = new ListView(lineNumber, padding);
            if (children != null) {
                for (Object child : children) {
                    if (child != null) {
                        listView.addChild(child);
                    }
                }
            }


            this.symbolTable.setData("flutter class", "List View");


            nodes.add(listView);
            return listView;

        }
        return null;
    }


    @Override
    public SetState visitSet_state(FlutterParser.Set_stateContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            SetState setState = new SetState(lineNumber);
            List<Object> o = new ArrayList<>();
            for (int i = 0; i < ctx.getChildCount(); i++) {
                setState.addChild(visitStructure(ctx.structure(i)));
            }
            this.symbolTable.setData("flutter Function", "setState");


            return setState;
        }
        return null;
    }

    @Override
    public GestureDetector visitGesture_detector(FlutterParser.Gesture_detectorContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            GestureDetector gestureDetector = new GestureDetector(lineNumber);
            for (int i = 0; i < ctx.getChildCount() - 3; i++) {
                gestureDetector.addChild(visitGesture_detector_properities(ctx.gesture_detector_properities(i)));
            }


            this.symbolTable.setData("flutter class", "Gesture Detector");

            return gestureDetector;
        }
        return null;
    }


    @Override
    public Object visitGesture_detector_properities(FlutterParser.Gesture_detector_properitiesContext ctx) {
        if (ctx != null) {
            Object temp = null;
            Object vt = visitOn_tap(ctx.on_tap());
            Object vc = visitChild(ctx.child());
            if (vt != null) {
                temp = vt;
            }
            if (vc != null) {
                temp = vc;
            }
            return temp;
        }
        return null;
    }

    @Override
    public Text visitText(FlutterParser.TextContext ctx) {
        if (ctx != null) {
            int lineNumber = ctx.start.getLine();
            String child = visitId(ctx.id());


            this.symbolTable.setData("flutter class", "Text");

            Text text = new Text(lineNumber, child);
            nodes.add(text);

            return text;
        }
        return null;
    }


    @Override
    public Node visitImport_f(FlutterParser.Import_fContext ctx) {
        if (ctx != null) {
            String child = ctx.getChild(1).getText();
            int lineNumber = ctx.IMPORT_().getSymbol().getLine();
            return new Import(lineNumber, child);
        }
        return null;

    }


    @Override
    public Object visit(ParseTree tree) {

        return tree.accept(this);
    }


    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
