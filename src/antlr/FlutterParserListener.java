// Generated from C:/Users/faleh/Desktop/univ/compiler project 1/Compiler Project/dart_to_web_compiler - Copy/src/antlr\FlutterParser.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlutterParser}.
 */
public interface FlutterParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(FlutterParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(FlutterParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(FlutterParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(FlutterParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(FlutterParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(FlutterParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FlutterParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FlutterParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(FlutterParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(FlutterParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(FlutterParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(FlutterParser.NumbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(FlutterParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(FlutterParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(FlutterParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(FlutterParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#one_return}.
	 * @param ctx the parse tree
	 */
	void enterOne_return(FlutterParser.One_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#one_return}.
	 * @param ctx the parse tree
	 */
	void exitOne_return(FlutterParser.One_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(FlutterParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(FlutterParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#variable_call}.
	 * @param ctx the parse tree
	 */
	void enterVariable_call(FlutterParser.Variable_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#variable_call}.
	 * @param ctx the parse tree
	 */
	void exitVariable_call(FlutterParser.Variable_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FlutterParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FlutterParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(FlutterParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(FlutterParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(FlutterParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(FlutterParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void enterVariable_access(FlutterParser.Variable_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void exitVariable_access(FlutterParser.Variable_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_access}.
	 * @param ctx the parse tree
	 */
	void enterFunction_access(FlutterParser.Function_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_access}.
	 * @param ctx the parse tree
	 */
	void exitFunction_access(FlutterParser.Function_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(FlutterParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(FlutterParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_header}.
	 * @param ctx the parse tree
	 */
	void enterClass_header(FlutterParser.Class_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_header}.
	 * @param ctx the parse tree
	 */
	void exitClass_header(FlutterParser.Class_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(FlutterParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(FlutterParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(FlutterParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(FlutterParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#extends_class}.
	 * @param ctx the parse tree
	 */
	void enterExtends_class(FlutterParser.Extends_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#extends_class}.
	 * @param ctx the parse tree
	 */
	void exitExtends_class(FlutterParser.Extends_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void enterClass_instance(FlutterParser.Class_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void exitClass_instance(FlutterParser.Class_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_call}.
	 * @param ctx the parse tree
	 */
	void enterClass_call(FlutterParser.Class_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_call}.
	 * @param ctx the parse tree
	 */
	void exitClass_call(FlutterParser.Class_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FlutterParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FlutterParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_decl}.
	 * @param ctx the parse tree
	 */
	void enterList_decl(FlutterParser.List_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_decl}.
	 * @param ctx the parse tree
	 */
	void exitList_decl(FlutterParser.List_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#new_list}.
	 * @param ctx the parse tree
	 */
	void enterNew_list(FlutterParser.New_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#new_list}.
	 * @param ctx the parse tree
	 */
	void exitNew_list(FlutterParser.New_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_values}.
	 * @param ctx the parse tree
	 */
	void enterList_values(FlutterParser.List_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_values}.
	 * @param ctx the parse tree
	 */
	void exitList_values(FlutterParser.List_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_assignement}.
	 * @param ctx the parse tree
	 */
	void enterList_assignement(FlutterParser.List_assignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_assignement}.
	 * @param ctx the parse tree
	 */
	void exitList_assignement(FlutterParser.List_assignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_value_call}.
	 * @param ctx the parse tree
	 */
	void enterList_value_call(FlutterParser.List_value_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_value_call}.
	 * @param ctx the parse tree
	 */
	void exitList_value_call(FlutterParser.List_value_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#override}.
	 * @param ctx the parse tree
	 */
	void enterOverride(FlutterParser.OverrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#override}.
	 * @param ctx the parse tree
	 */
	void exitOverride(FlutterParser.OverrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FlutterParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FlutterParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(FlutterParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(FlutterParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FlutterParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FlutterParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FlutterParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FlutterParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#comparison_operations}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operations(FlutterParser.Comparison_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#comparison_operations}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operations(FlutterParser.Comparison_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(FlutterParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(FlutterParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_header(FlutterParser.For_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_header(FlutterParser.For_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_body}.
	 * @param ctx the parse tree
	 */
	void enterFor_body(FlutterParser.For_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_body}.
	 * @param ctx the parse tree
	 */
	void exitFor_body(FlutterParser.For_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFor_var_decl(FlutterParser.For_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFor_var_decl(FlutterParser.For_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_var_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_var_init(FlutterParser.For_var_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_var_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_var_init(FlutterParser.For_var_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_var}.
	 * @param ctx the parse tree
	 */
	void enterFor_var(FlutterParser.For_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_var}.
	 * @param ctx the parse tree
	 */
	void exitFor_var(FlutterParser.For_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_structure}.
	 * @param ctx the parse tree
	 */
	void enterFor_structure(FlutterParser.For_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_structure}.
	 * @param ctx the parse tree
	 */
	void exitFor_structure(FlutterParser.For_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(FlutterParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(FlutterParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_each_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_header(FlutterParser.For_each_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_each_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_header(FlutterParser.For_each_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(FlutterParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(FlutterParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#while_header}.
	 * @param ctx the parse tree
	 */
	void enterWhile_header(FlutterParser.While_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#while_header}.
	 * @param ctx the parse tree
	 */
	void exitWhile_header(FlutterParser.While_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(FlutterParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(FlutterParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(FlutterParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(FlutterParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#if_header}.
	 * @param ctx the parse tree
	 */
	void enterIf_header(FlutterParser.If_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#if_header}.
	 * @param ctx the parse tree
	 */
	void exitIf_header(FlutterParser.If_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(FlutterParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(FlutterParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(FlutterParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(FlutterParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch(FlutterParser.Try_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch(FlutterParser.Try_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#try}.
	 * @param ctx the parse tree
	 */
	void enterTry(FlutterParser.TryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#try}.
	 * @param ctx the parse tree
	 */
	void exitTry(FlutterParser.TryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#catche}.
	 * @param ctx the parse tree
	 */
	void enterCatche(FlutterParser.CatcheContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#catche}.
	 * @param ctx the parse tree
	 */
	void exitCatche(FlutterParser.CatcheContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#finaly}.
	 * @param ctx the parse tree
	 */
	void enterFinaly(FlutterParser.FinalyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#finaly}.
	 * @param ctx the parse tree
	 */
	void exitFinaly(FlutterParser.FinalyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(FlutterParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(FlutterParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#this}.
	 * @param ctx the parse tree
	 */
	void enterThis(FlutterParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#this}.
	 * @param ctx the parse tree
	 */
	void exitThis(FlutterParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#flutter_classes}.
	 * @param ctx the parse tree
	 */
	void enterFlutter_classes(FlutterParser.Flutter_classesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#flutter_classes}.
	 * @param ctx the parse tree
	 */
	void exitFlutter_classes(FlutterParser.Flutter_classesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#flutter_functions}.
	 * @param ctx the parse tree
	 */
	void enterFlutter_functions(FlutterParser.Flutter_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#flutter_functions}.
	 * @param ctx the parse tree
	 */
	void exitFlutter_functions(FlutterParser.Flutter_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(FlutterParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(FlutterParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(FlutterParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(FlutterParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(FlutterParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(FlutterParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(FlutterParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(FlutterParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FlutterParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FlutterParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(FlutterParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(FlutterParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(FlutterParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(FlutterParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#margin}.
	 * @param ctx the parse tree
	 */
	void enterMargin(FlutterParser.MarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#margin}.
	 * @param ctx the parse tree
	 */
	void exitMargin(FlutterParser.MarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(FlutterParser.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(FlutterParser.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#on_tap}.
	 * @param ctx the parse tree
	 */
	void enterOn_tap(FlutterParser.On_tapContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#on_tap}.
	 * @param ctx the parse tree
	 */
	void exitOn_tap(FlutterParser.On_tapContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#run_app_call}.
	 * @param ctx the parse tree
	 */
	void enterRun_app_call(FlutterParser.Run_app_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#run_app_call}.
	 * @param ctx the parse tree
	 */
	void exitRun_app_call(FlutterParser.Run_app_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#material_app_call}.
	 * @param ctx the parse tree
	 */
	void enterMaterial_app_call(FlutterParser.Material_app_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#material_app_call}.
	 * @param ctx the parse tree
	 */
	void exitMaterial_app_call(FlutterParser.Material_app_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#material_app_properities}.
	 * @param ctx the parse tree
	 */
	void enterMaterial_app_properities(FlutterParser.Material_app_properitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#material_app_properities}.
	 * @param ctx the parse tree
	 */
	void exitMaterial_app_properities(FlutterParser.Material_app_properitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#scaffold_call}.
	 * @param ctx the parse tree
	 */
	void enterScaffold_call(FlutterParser.Scaffold_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#scaffold_call}.
	 * @param ctx the parse tree
	 */
	void exitScaffold_call(FlutterParser.Scaffold_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#scaffold_call_properities}.
	 * @param ctx the parse tree
	 */
	void enterScaffold_call_properities(FlutterParser.Scaffold_call_properitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#scaffold_call_properities}.
	 * @param ctx the parse tree
	 */
	void exitScaffold_call_properities(FlutterParser.Scaffold_call_properitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(FlutterParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(FlutterParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#row_properities}.
	 * @param ctx the parse tree
	 */
	void enterRow_properities(FlutterParser.Row_properitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#row_properities}.
	 * @param ctx the parse tree
	 */
	void exitRow_properities(FlutterParser.Row_properitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(FlutterParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(FlutterParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#column_properities}.
	 * @param ctx the parse tree
	 */
	void enterColumn_properities(FlutterParser.Column_properitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#column_properities}.
	 * @param ctx the parse tree
	 */
	void exitColumn_properities(FlutterParser.Column_properitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(FlutterParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(FlutterParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#container_properities}.
	 * @param ctx the parse tree
	 */
	void enterContainer_properities(FlutterParser.Container_properitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#container_properities}.
	 * @param ctx the parse tree
	 */
	void exitContainer_properities(FlutterParser.Container_properitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_view}.
	 * @param ctx the parse tree
	 */
	void enterList_view(FlutterParser.List_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_view}.
	 * @param ctx the parse tree
	 */
	void exitList_view(FlutterParser.List_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#set_state}.
	 * @param ctx the parse tree
	 */
	void enterSet_state(FlutterParser.Set_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#set_state}.
	 * @param ctx the parse tree
	 */
	void exitSet_state(FlutterParser.Set_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#gesture_detector}.
	 * @param ctx the parse tree
	 */
	void enterGesture_detector(FlutterParser.Gesture_detectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#gesture_detector}.
	 * @param ctx the parse tree
	 */
	void exitGesture_detector(FlutterParser.Gesture_detectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#gesture_detector_properities}.
	 * @param ctx the parse tree
	 */
	void enterGesture_detector_properities(FlutterParser.Gesture_detector_properitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#gesture_detector_properities}.
	 * @param ctx the parse tree
	 */
	void exitGesture_detector_properities(FlutterParser.Gesture_detector_properitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(FlutterParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(FlutterParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#import_f}.
	 * @param ctx the parse tree
	 */
	void enterImport_f(FlutterParser.Import_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#import_f}.
	 * @param ctx the parse tree
	 */
	void exitImport_f(FlutterParser.Import_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#materialPageRoute}.
	 * @param ctx the parse tree
	 */
	void enterMaterialPageRoute(FlutterParser.MaterialPageRouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#materialPageRoute}.
	 * @param ctx the parse tree
	 */
	void exitMaterialPageRoute(FlutterParser.MaterialPageRouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#builder}.
	 * @param ctx the parse tree
	 */
	void enterBuilder(FlutterParser.BuilderContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#builder}.
	 * @param ctx the parse tree
	 */
	void exitBuilder(FlutterParser.BuilderContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#materialPageRouteProperities}.
	 * @param ctx the parse tree
	 */
	void enterMaterialPageRouteProperities(FlutterParser.MaterialPageRouteProperitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#materialPageRouteProperities}.
	 * @param ctx the parse tree
	 */
	void exitMaterialPageRouteProperities(FlutterParser.MaterialPageRouteProperitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#navigator}.
	 * @param ctx the parse tree
	 */
	void enterNavigator(FlutterParser.NavigatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#navigator}.
	 * @param ctx the parse tree
	 */
	void exitNavigator(FlutterParser.NavigatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textfield}.
	 * @param ctx the parse tree
	 */
	void enterTextfield(FlutterParser.TextfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textfield}.
	 * @param ctx the parse tree
	 */
	void exitTextfield(FlutterParser.TextfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textfieldproperties}.
	 * @param ctx the parse tree
	 */
	void enterTextfieldproperties(FlutterParser.TextfieldpropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textfieldproperties}.
	 * @param ctx the parse tree
	 */
	void exitTextfieldproperties(FlutterParser.TextfieldpropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#onchanged}.
	 * @param ctx the parse tree
	 */
	void enterOnchanged(FlutterParser.OnchangedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#onchanged}.
	 * @param ctx the parse tree
	 */
	void exitOnchanged(FlutterParser.OnchangedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#decoration}.
	 * @param ctx the parse tree
	 */
	void enterDecoration(FlutterParser.DecorationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#decoration}.
	 * @param ctx the parse tree
	 */
	void exitDecoration(FlutterParser.DecorationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#border}.
	 * @param ctx the parse tree
	 */
	void enterBorder(FlutterParser.BorderContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#border}.
	 * @param ctx the parse tree
	 */
	void exitBorder(FlutterParser.BorderContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(FlutterParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(FlutterParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#inputDecoration}.
	 * @param ctx the parse tree
	 */
	void enterInputDecoration(FlutterParser.InputDecorationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#inputDecoration}.
	 * @param ctx the parse tree
	 */
	void exitInputDecoration(FlutterParser.InputDecorationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#inputDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void enterInputDecorationProperties(FlutterParser.InputDecorationPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#inputDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void exitInputDecorationProperties(FlutterParser.InputDecorationPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#floatingactionbutton}.
	 * @param ctx the parse tree
	 */
	void enterFloatingactionbutton(FlutterParser.FloatingactionbuttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#floatingactionbutton}.
	 * @param ctx the parse tree
	 */
	void exitFloatingactionbutton(FlutterParser.FloatingactionbuttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(FlutterParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(FlutterParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterButtonProperties(FlutterParser.ButtonPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitButtonProperties(FlutterParser.ButtonPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#floatProperties}.
	 * @param ctx the parse tree
	 */
	void enterFloatProperties(FlutterParser.FloatPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#floatProperties}.
	 * @param ctx the parse tree
	 */
	void exitFloatProperties(FlutterParser.FloatPropertiesContext ctx);
}