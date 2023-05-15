lexer grammar FlutterLexer;

options { superClass=FlutterLexerBase; }

FAB : 'floatingActionButton';
FAB_ : 'FloatingActionButton';
ONCD : 'onChanged';
BORDER : 'border';
STYLE : 'style';
HINTTXT : 'hintText';
DECORATION : 'decoration';
TXTFLD : 'TextFormField';
TXTBTN : 'TextButton';
INDEC : 'InputDecoration';
NAV : 'Navigator';
PUSH : 'push';
BUILDER : 'builder';
MPR : 'MaterialPageRoute';
INT : [0-9]+ ;
CONST_:'const';
RUNAPP_:'runApp';
MATERIALAPP_:'MaterialApp';
HOME_:'home';
BODY_:'body';
CHILDREN_:'children';
SCAFFOLD_:'Scaffold';
ROW_:'Row';
COLOR_:'color';
PADDING_:'padding';
COLORS_:'Colors';
CONTAINER_:'Container';
CHILD_:'child';
BOOLEAN:(TRUE_ | FALSE_);

FLOAT: [+-]?([0-9]*[.])?[0-9]+;
DOUBLE:[+-]?([0-9]*[.])?[0-9]+;
DATA_TYPE :  (INT_ | STRING_ | FLOAT_ | BOOLEAN_ | DOUBLE_ | VAR_  | BUILDCONTEXT_ |WIDGET_ | FUNCTION_) ;
WIDTH_: 'width';
HEIGHT_: 'height';
MARGIN_: 'margin';
WIDGET_: 'Widget';
EDGEINSETS_: 'EdgeInsets';
LISTVIEW_: 'ListView';
BUILDCONTEXT_: 'BuildContext';
GESTUREDETECTOR_: 'GestureDetector';
ONTAP_: 'onTap';
COLUMN_:'Column';
TEXT_:'Text';
SETSTATE_: 'setState';
VOID: 'void';
INT_: 'int';
STRING_: 'string' | 'String';
FLOAT_: 'float';
BOOLEAN_: 'boolean';
FUNCTION_: 'Function()';
MAP_: 'map';
DOUBLE_: 'double';
OVERRIDE_: '@override';
C_AND_F: (FINAL_ | CONST_);
LIST: 'List';
PRINT_: 'print';
A: '&';
AA: '&&';
AE: '&=';
AT: '@';
C: ',';
CB: ']';
CBC: '}';
CIR: '^';
CIRE: '^=';
CO: ':';
CP: ')';
D: '.';
LATE: 'late';
EE: '==';
EG: '=>';
EQ: '=';
GT: '>';
LT: '<';
LTE: '<=';
ME: '-=';
MINUS: '-';
MM: '--';
NE: '!=';
NOT: '!';
OB: '[';
OBC: '{';
OP: '(';
P: '|';
PC: '%';
PE: '%=';
PLPL: '++';
PL: '+';
PLE: '+=';
PO: '#';
POE: '|=';
PP: '||';
SC: ';';
SE: '/=';
SL: '/';
ST: '*';
STE: '*=';
ABSTRACT_:'abstract';
AS_:'as';
BREAK_:'break';
CASE_:'case';
CATCH_:'catch';
CLASS_:'class';
CONTINUE_:'continue';
DEFAULT_:'default';
DO_:'do';
DYNAMIC_:'dynamic';
ELSE_:'else';
ENUM_:'enum';
EXTENDS_:'extends';
FALSE_:'false';
FINAL_:'final';
FINALLY_:'finally';
FOR_:'for';
IF_:'if';
IMPLEMENTS_:'implements';
IMPORT_:'import';
IN_:'in';
INTERFACE_:'interface';
IS_:'is';
LET_:'let';
LIBRARY_:'library';
NEW_:'new';
NULL_:'null';
OF_:'of';
ON_:'on';
REQUIRED_:'required';
RETHROW_:'rethrow';
RETURN_:'return';
STATIC_:'static';
SUPER_:'super';
SWITCH_:'switch';
THIS_:'this';
THROW_:'throw';
TRUE_:'true';
TRY_:'try';
VAR_:'var';
WHILE_:'while';
UNDERSCORE: '_';

STRING :(SQUTE (SEQUENCES | INT)* SQUTE) | SingleLineString | MultiLineString;

QUTE: '"';
SQUTE: '\'';
QM: '?';

HEX_NUMBER : '0x' HEX_DIGIT+ | '0X' HEX_DIGIT+ ;
SingleLineString : StringDQ | StringSQ | 'r\'' (~('\'' | '\n' | '\r'))* '\'' | 'r"' (~('"' | '\n' | '\r'))* '"' ;
MultiLineString : '"""' StringContentTDQ*? '"""' | '\'\'\'' StringContentTSQ*? '\'\'\'' | 'r"""' (~'"' | '"' ~'"' | '""' ~'"')* '"""' | 'r\'\'\'' (~'\'' | '\'' ~'\'' | '\'\'' ~'\'')* '\'\'\'' ;
IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART* ;
WHITESPACE : ( '\t' | ' ' | NEWLINE )+  -> skip;
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '/*' ( MULTI_LINE_COMMENT | . )*? '*/'  -> skip ;
fragment EXPONENT : ( 'e' | 'E' ) ( '+' | '-' )? DIGIT+ ;
fragment HEX_DIGIT : 'a' .. 'f' | 'A' .. 'F' | DIGIT ;
fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment ESCAPE_SEQUENCE : '\n' | '\r' | '\\f' | '\\b' | '\t' | '\\v' | '\\x' HEX_DIGIT HEX_DIGIT | '\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '\\u{' HEX_DIGIT_SEQUENCE '}' ;
fragment HEX_DIGIT_SEQUENCE : HEX_DIGIT HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? ;
fragment NEWLINE : '\n' | '\r' | '\r\n' ;
fragment BUILT_IN_IDENTIFIER : 'abstract' | 'as' | 'covariant' | 'deferred' | 'dynamic' | 'export' | 'external' | 'extension' | 'factory' | 'Function' | 'get' | 'implements' | 'import' | 'interface' | 'late' | 'library' | 'mixin' | 'operator' | 'part' | 'required' | 'set' | 'static' | 'typedef' ;
fragment IDENTIFIER_NO_DOLLAR : IDENTIFIER_START_NO_DOLLAR IDENTIFIER_PART_NO_DOLLAR* ;
fragment IDENTIFIER_START_NO_DOLLAR : LETTER | '_' ;
fragment IDENTIFIER_PART_NO_DOLLAR : IDENTIFIER_START_NO_DOLLAR | DIGIT ;
fragment IDENTIFIER_START : IDENTIFIER_START_NO_DOLLAR | '$' ;
fragment IDENTIFIER_PART : IDENTIFIER_START | DIGIT | '+';
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;
fragment DIGIT : '0' .. '9' ;
fragment SEQUENCES : (LOWERCASE | UPPERCASE);
fragment LOWERCASE : [a-z];
fragment UPPERCASE : [A-Z];
