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

OPERATOR==(\.\.|\\=|:=|=)?|(\\==?)|\+|-|\*|>(>|=)?|<(<|=)?|(is)
ATOM=([a-z][a-zA-Z0-9_]*)|('([^'\\]|\\.)*')
VAR=[A-Z_][a-zA-Z0-9_]*
NUMBER=(-)?(0((x[0-9a-fA-F]+)|(b[10]+)|(o[0-7]+))?|[1-9][0-9]*(\.[0-9]+)?(E(\+|\-)?[0-9]+)?)
STRING='([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\"
COMMENT=(%[^\r\n]*)|("/"\*([^\*]|\*[^/]|\n)*\*"/")

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "."                { return DOT; }
  ":-"               { return IMPLIES; }
  ","                { return COMMA; }
  "("                { return LPAREN; }
  ")"                { return RPAREN; }
  "!"                { return CUT; }
  "["                { return LBRACKET; }
  "]"                { return RBRACKET; }
  ":"                { return COLON; }
  ";"                { return SEMICOLON; }
  "|"                { return PIPE; }
  "?-"               { return PROMPT; }
  "^"                { return HAT; }
  "->"               { return IFTHEN; }
  "*->"              { return SOFTCUT; }
  "\\+"              { return NOT; }
  "-->"              { return DCG; }
  "{"                { return LBRACE; }
  "}"                { return RBRACE; }
  "/"                { return SLASH; }
  "once"             { return ONCE; }

  {OPERATOR}         { return OPERATOR; }
  {ATOM}             { return ATOM; }
  {VAR}              { return VAR; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }
  {COMMENT}          { return COMMENT; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
