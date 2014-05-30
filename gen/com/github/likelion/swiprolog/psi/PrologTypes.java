// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.likelion.swiprolog.psi.impl.*;

public interface PrologTypes {

  IElementType CLAUSE = new PrologElementType("CLAUSE");
  IElementType DIRECTIVE = new PrologElementType("DIRECTIVE");
  IElementType QUERY = new PrologElementType("QUERY");
  IElementType TERM = new PrologElementType("TERM");

  IElementType ATOM = new PrologTokenType("ATOM");
  IElementType COLON = new PrologTokenType(":");
  IElementType COMMA = new PrologTokenType(",");
  IElementType COMMENT = new PrologTokenType("COMMENT");
  IElementType CUT = new PrologTokenType("!");
  IElementType DCG = new PrologTokenType("-->");
  IElementType DOT = new PrologTokenType(".");
  IElementType HAT = new PrologTokenType("^");
  IElementType IFTHEN = new PrologTokenType("->");
  IElementType IMPLIES = new PrologTokenType(":-");
  IElementType LBRACE = new PrologTokenType("{");
  IElementType LBRACKET = new PrologTokenType("[");
  IElementType LPAREN = new PrologTokenType("(");
  IElementType NOT = new PrologTokenType("\\+");
  IElementType NUMBER = new PrologTokenType("NUMBER");
  IElementType ONCE = new PrologTokenType("once");
  IElementType OPERATOR = new PrologTokenType("OPERATOR");
  IElementType PIPE = new PrologTokenType("|");
  IElementType PROMPT = new PrologTokenType("?-");
  IElementType RBRACE = new PrologTokenType("}");
  IElementType RBRACKET = new PrologTokenType("]");
  IElementType RPAREN = new PrologTokenType(")");
  IElementType SEMICOLON = new PrologTokenType(";");
  IElementType SLASH = new PrologTokenType("/");
  IElementType SOFTCUT = new PrologTokenType("*->");
  IElementType STRING = new PrologTokenType("STRING");
  IElementType VAR = new PrologTokenType("VAR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CLAUSE) {
        return new PrologClauseImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new PrologDirectiveImpl(node);
      }
      else if (type == QUERY) {
        return new PrologQueryImpl(node);
      }
      else if (type == TERM) {
        return new PrologTermImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
