grammar Identifier;

VAR: [a-z][a-zA-Z_0-9]*;
LODASH: '_';
DOLLAR: '$';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

r: LODASH VAR';' | DOLLAR VAR';';