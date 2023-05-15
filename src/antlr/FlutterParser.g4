parser grammar FlutterParser;

options { tokenVocab=FlutterLexer; }

program :(textfield | function|class | import_f SC)+  EOF
;


//dart
function:function_header function_body
;
function_header: function_access UNDERSCORE? id OP (DATA_TYPE QM? id)? (C (DATA_TYPE QM? id))* CP;
structure:( material_app_call | run_app_call |class_call | variable | decl| init| function | class | list | override|
variable_call| list_assignement| for_loop | for_each | while | do_while | if | try_catch
|function_call SC| list_value_call | enum | class_instance | flutter_functions | flutter_classes | this ) | return | one_return;
function_body: one_return | OBC structure* CBC;
function_call: UNDERSCORE? id OP ( class_call* | argument* | variable_call* | expr* | exp*) CP;
//function_parameters:(DATA_TYPE QM? id)? (C (DATA_TYPE QM? id))* ;
return: RETURN_ ( flutter_classes | class_call | argument | variable_call | function_call | expr | exp ) SC
;
numbers:  FLOAT
 | DOUBLE
 | INT
 ;
values: STRING
| BOOLEAN
| NULL_
;
id:IDENTIFIER
;
one_return: EG ( flutter_classes| class_call | argument | variable_call | function_call | expr | exp ) SC;
argument:values | numbers | BOOLEAN;
variable_call:id;
variable:variable_access? UNDERSCORE? id EQ (argument | variable_call | new_list | OB (list_values) CB | expr
 ) SC
;
decl: LATE? (DATA_TYPE QM? id SC);
init: id EQ (values | BOOLEAN | numbers | id | expr | exp) SC;
variable_access: ((STATIC_? C_AND_F? DATA_TYPE QM?) | C_AND_F);
function_access: ((STATIC_? (VOID | DATA_TYPE QM?)?));
class:class_header extends_class? class_body
 ;
class_header:class_type UNDERSCORE? id  ;
class_body:OBC (structure*) CBC;
class_type:ABSTRACT_? CLASS_;
extends_class: ((EXTENDS_ | IMPLEMENTS_) id (LT id GT)?) ;
class_instance :  NEW_? id OP argument* CP;
class_call : ((CONST_? id OP parameters  CP) | flutter_classes | set_state) SC?;
list: list_decl | LIST id (LT DATA_TYPE GT)? EQ OB (list_values) CB SC;
list_decl: LATE? LIST id SC;
new_list :  NEW_? LIST OP CP;
list_values:(argument)? (C (argument))* ;
list_assignement: id OB INT CB EQ (INT | values | BOOLEAN | numbers | expr | exp) SC;
list_value_call: id OB INT CB SC;
override:OVERRIDE_;
parameters:(id | argument | fun | this)? (C (id | argument | fun | this))* ;
fun: OP argument* CP OBC structure*  CBC;


expr :
     expr ST expr
     | expr PL expr
     | expr MINUS expr
     | id
     | numbers
     | INT
     ;

  exp :
      exp PLPL
     | exp MM
     | id
     | numbers
     | INT
     ;
comparison_operations :
       expr EG expr
     | expr LTE expr
     | expr GT expr
     | expr LT expr
     | expr EE expr
     | expr NE expr
     | id
     | numbers
     | INT;
for_loop:for_header for_body ;
for_header:  FOR_ OP (for_var_decl | for_var_init) SC comparison_operations  SC for_var CP  ;
for_body: OBC  for_structure * CBC;
for_var_decl: DATA_TYPE id EQ (numbers | variable_call | expr | exp );
for_var_init:  id (EQ (numbers | variable_call | expr | exp ) );
for_var:  id (EQ (numbers | variable_call | expr ) )| exp;
for_structure:(variable | decl| init| for_loop | for_each |while | do_while
| if | try_catch |function | list | variable_call| list_assignement |class_call SC
 |function_call SC| list_value_call | enum | class_instance | BREAK_ | CONTINUE_) | return ;

for_each:for_each_header for_body;
for_each_header: FOR_ OP DATA_TYPE id IN_ id CP;

while: while_header for_body;
while_header:WHILE_ OP (comparison_operations | BOOLEAN) CP;

do_while: DO_ for_body while_header SC;
if:if_header for_body else_if* else*;
if_header: IF_ OP (comparison_operations | BOOLEAN) CP ;
else_if: ELSE_ if_header for_body;
else: ELSE_ for_body;

try_catch: try catche+ finaly?;
try:TRY_ for_body;
catche: CATCH_ OP id CP for_body;
finaly: FINALLY_ for_body;

enum:ENUM_ id OBC list_values CBC;

this: THIS_ D (id | id EQ values) SC?;



//flutter
flutter_classes: button | inputDecoration | textfield | run_app_call | text |  material_app_call | scaffold_call | row | column| container | list_view | gesture_detector | column;
flutter_functions: set_state;

children: CHILDREN_ CO OB (class_call? (C class_call)*) C? CB;
child:CHILD_ CO class_call ;
color:COLOR_ CO COLORS_ D id ;
home: HOME_ CO class_call;
body: BODY_ CO (class_call | set_state);
width: WIDTH_ CO numbers;
height: HEIGHT_ CO numbers;
margin : MARGIN_ CO EDGEINSETS_ D function_call;
padding : PADDING_ CO EDGEINSETS_ D function_call;
on_tap : ONTAP_ CO OP CP OBC ( id | navigator | set_state) CBC C?;

run_app_call: RUNAPP_ OP class_call CP SC; //runApp def

material_app_call: MATERIALAPP_ OP material_app_properities* CP
; //materialApp def
material_app_properities: home C?; // materialApp props

scaffold_call: SCAFFOLD_ OP scaffold_call_properities* CP
;
scaffold_call_properities: body; // scaffold props

row: ROW_ OP row_properities CP C?
;
row_properities: children? C?;

column: COLUMN_ OP column_properities CP C?
;
column_properities: children? C?;

container:CONTAINER_ OP container_properities* CP
;
container_properities: child C?
                        |  color C?
                        |  width C?
                        |  height C?
                        |  margin C?
                        ;
//
//list_view: LISTVIEW_ OP  (children C? | padding C?)+ CP C?
//;
//list_view_properities:;

list_view: LISTVIEW_ OP  padding? C?  children? CP C?
;
set_state: SETSTATE_ OP CP OBC
 structure* CBC SC C?;

gesture_detector: GESTUREDETECTOR_ OP gesture_detector_properities* CP
 ;
gesture_detector_properities: on_tap C? | child C?;

text: TEXT_ OP id CP
;

import_f: IMPORT_ values
;
materialPageRoute: MPR OP materialPageRouteProperities CP
;
builder: BUILDER CO OP id CP EG class_call C?
;
materialPageRouteProperities: builder C?

;
navigator: NAV D PUSH OP id C materialPageRoute C? CP SC
;

textfield: TXTFLD OP textfieldproperties+ CP C?
;

textfieldproperties: (decoration | onchanged) C?;

onchanged: ONCD CO OP id CP OBC variable CBC C? ;

decoration: DECORATION CO inputDecoration C?;

border: BORDER CO class_call C?
;


hint: HINTTXT CO STRING C?;

inputDecoration: INDEC OP inputDecorationProperties+ CP C?
;

inputDecorationProperties: (border | hint);


button: TXTBTN OP buttonProperties+ CP C?
;

buttonProperties: (on_tap | child) // Note: onTap = onPressed
;
