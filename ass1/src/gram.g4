grammar gram;
/*
 * Parser Rules
 */
//parse : bl EOF;
parse : (if_start | assignment | exp )+;


exp :     SOBRAC exp SCBRAC                              #evalExp
        |  MINUS exp                                     #minusExp
        | NOT exp                                        #notExp
        | LBRAC exp RBRAC                                #bracExp
        | left =exp op =POW right=exp                    #powExp
        | left=exp op=(DIV|MULTI) right=exp              #divMultiExp
        | left=exp op=(PLUS|MINUS) right=exp             #addMinusExp
        | left=exp op=(LTEQ | GTEQ | LT | GT) right=exp  #relationalExpr
        | left=exp op=(EQ | NEQ) right=exp               #equalityExpr
        | left=exp AND right=exp                         #andExp
        | left=exp OR right=exp                          #orExp
        | number                                         #normExp
        ;


assignment : varName=VAR EQUALS varExpr=exp SCOL;

number : (MINUS)? (INT | FLOAT)                          #defExp
        | (NOT)?  (TRUE | FALSE )                        #boolExp
        | VAR                                            #varExp
        ;


if_start :IF cdn_exp (ELSE IF cdn_exp)* (ELSE stat_exp)?;

cdn_exp : exp stat_exp;

stat_exp: OCBRAC (if_start+ | assignment+ | exp+)* CCBRAC
        | exp;

/*
 *Lexer rules
 */


INT : [0-9]+ ;

FLOAT : [0-9]+ '.' [0-9]*
        | '.' [0-9]+;

TRUE : 'true';
FALSE : 'false';

PLUS : '+';
MINUS : '-';
EQUALS : '=';
MULTI : '*';
DIV : '/';
POW : '**';

SCOL : ';';

LBRAC : '(';
RBRAC : ')';
OCBRAC:'{';
CCBRAC:'}';
SOBRAC:'[';
SCBRAC:']';

IF : 'if';
ELSE : 'else';

NOT : '!';
AND : '&&';
OR : '||';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';

VAR : [a-zA-Z_] [a-zA-Z_0-9]*;

WHITESPACE : [ \t\r\n]+ -> skip;
