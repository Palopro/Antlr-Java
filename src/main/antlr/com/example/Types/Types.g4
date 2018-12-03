grammar Types;

BYTE : 'byte';
INT : 'int';
DOUBLE : 'double';
CLASS : 'class';
WHILE : 'while';
WHITESPACE : ' ';
EQUAL : '=';
SQRBRACKETS : '[]';
OPENFIGBRACK : '{';
VAR: [a-zA-Z_0-9]*;

type
    : BYTE
    | INT
    | DOUBLE
    ;

assigment
    : type WHITESPACE VAR WHITESPACE EQUAL WHITESPACE VAR
    | type WHITESPACE VAR EQUAL VAR
    | type WHITESPACE VAR
    ;

// OUT OF MEMORY!!!
// Don`t uncommit
//array
//    : type SQRBRACKETS WHITESPACE VAR
//    | type VAR WHITESPACE SQRBRACKETS
//    ;

class
    : CLASS WHITESPACE VAR OPENFIGBRACK
    | CLASS WHITESPACE VAR WHITESPACE OPENFIGBRACK
    ;

while
    : WHILE