package com.github.likelion.swiprolog;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.github.likelion.swiprolog.psi.PrologTypes.*;

%%

%{
  public _PrologLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _PrologLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

COMMENT=(%[^\r\n]*)|("/"\*([^\*]|\*[^/]|\n)*\*"/")
FUNCTION=abort|min
IDENTIFIER=[a-z][a-zA-Z0-9_]*
VAR=[A-Z_][a-zA-Z0-9_]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER=0|[1-9][0-9]*(\.[0-9]+)?(E(\+|\-)?[0-9]+)?

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "."                { return DOT; }
  ":-"               { return IMPLIES; }
  ","                { return COMMA; }
  "("                { return LPAREN; }
  ")"                { return RPAREN; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "fail"             { return FAIL; }
  "!"                { return CUT; }
  "["                { return LBRACKET; }
  "]"                { return RBRACKET; }
  ":"                { return COLON; }
  "|"                { return PIPE; }

  {COMMENT}          { return COMMENT; }
  {FUNCTION}         { return FUNCTION; }
  {IDENTIFIER}       { return IDENTIFIER; }
  {VAR}              { return VAR; }
  {STRING}           { return STRING; }
  {NUMBER}           { return NUMBER; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
