// Generated from C:/Users/faleh/Desktop/univ/compiler project 1/Compiler Project/Compile - Copy/src/antlr\FlutterParser.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlutterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlutterParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_header(FlutterParser.Function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(FlutterParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(FlutterParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FlutterParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(FlutterParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#numbers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbers(FlutterParser.NumbersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(FlutterParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(FlutterParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#one_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_return(FlutterParser.One_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(FlutterParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#variable_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_call(FlutterParser.Variable_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FlutterParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(FlutterParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(FlutterParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#variable_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_access(FlutterParser.Variable_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_access(FlutterParser.Function_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(FlutterParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_header(FlutterParser.Class_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(FlutterParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(FlutterParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#extends_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_class(FlutterParser.Extends_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_instance(FlutterParser.Class_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_call(FlutterParser.Class_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FlutterParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_decl(FlutterParser.List_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#new_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_list(FlutterParser.New_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_values(FlutterParser.List_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_assignement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_assignement(FlutterParser.List_assignementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_value_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value_call(FlutterParser.List_value_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#override}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverride(FlutterParser.OverrideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FlutterParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(FlutterParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FlutterParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(FlutterParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#comparison_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operations(FlutterParser.Comparison_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(FlutterParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_header(FlutterParser.For_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_body(FlutterParser.For_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var_decl(FlutterParser.For_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var_init(FlutterParser.For_var_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var(FlutterParser.For_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_structure(FlutterParser.For_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(FlutterParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_each_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_header(FlutterParser.For_each_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(FlutterParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#while_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_header(FlutterParser.While_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(FlutterParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(FlutterParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#if_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_header(FlutterParser.If_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(FlutterParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(FlutterParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#try_catch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch(FlutterParser.Try_catchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#try}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry(FlutterParser.TryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#catche}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatche(FlutterParser.CatcheContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#finaly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinaly(FlutterParser.FinalyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(FlutterParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#this}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(FlutterParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#flutter_classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutter_classes(FlutterParser.Flutter_classesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#flutter_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutter_functions(FlutterParser.Flutter_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(FlutterParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(FlutterParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(FlutterParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(FlutterParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FlutterParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(FlutterParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(FlutterParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#margin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin(FlutterParser.MarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(FlutterParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#on_tap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_tap(FlutterParser.On_tapContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#run_app_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_app_call(FlutterParser.Run_app_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#material_app_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterial_app_call(FlutterParser.Material_app_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#material_app_properities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterial_app_properities(FlutterParser.Material_app_properitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#scaffold_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold_call(FlutterParser.Scaffold_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#scaffold_call_properities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold_call_properities(FlutterParser.Scaffold_call_properitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(FlutterParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#row_properities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_properities(FlutterParser.Row_properitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(FlutterParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#column_properities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_properities(FlutterParser.Column_properitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(FlutterParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#container_properities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_properities(FlutterParser.Container_properitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_view(FlutterParser.List_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#set_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_state(FlutterParser.Set_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#gesture_detector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGesture_detector(FlutterParser.Gesture_detectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#gesture_detector_properities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGesture_detector_properities(FlutterParser.Gesture_detector_properitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(FlutterParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#import_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_f(FlutterParser.Import_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#materialPageRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialPageRoute(FlutterParser.MaterialPageRouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#builder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilder(FlutterParser.BuilderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#materialPageRouteProperities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialPageRouteProperities(FlutterParser.MaterialPageRouteProperitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#navigator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigator(FlutterParser.NavigatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextfield(FlutterParser.TextfieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textfieldproperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextfieldproperties(FlutterParser.TextfieldpropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#onchanged}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnchanged(FlutterParser.OnchangedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(FlutterParser.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#border}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder(FlutterParser.BorderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(FlutterParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#inputDecoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecoration(FlutterParser.InputDecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#inputDecorationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationProperties(FlutterParser.InputDecorationPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(FlutterParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonProperties(FlutterParser.ButtonPropertiesContext ctx);
}