// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.likelion.swiprolog.psi.impl.*;

public interface PrologTypes {

  IElementType ARG = new PrologElementType("ARG");
  IElementType ARGLIST = new PrologElementType("ARGLIST");
  IElementType BODYPREDICATE = new PrologElementType("BODYPREDICATE");
  IElementType CLAUSE = new PrologElementType("CLAUSE");
  IElementType ELEMENT = new PrologElementType("ELEMENT");
  IElementType ELEMENTLIST = new PrologElementType("ELEMENTLIST");
  IElementType FACT = new PrologElementType("FACT");
  IElementType INSTRUCTION = new PrologElementType("INSTRUCTION");
  IElementType LIST = new PrologElementType("LIST");
  IElementType LITERAL = new PrologElementType("LITERAL");
  IElementType PREDICATE = new PrologElementType("PREDICATE");

  IElementType COLON = new PrologTokenType(":");
  IElementType COMMA = new PrologTokenType(",");
  IElementType COMMENT = new PrologTokenType("COMMENT");
  IElementType CUT = new PrologTokenType("!");
  IElementType DOT = new PrologTokenType(".");
  IElementType FAIL = new PrologTokenType("fail");
  IElementType FALSE = new PrologTokenType("false");
  IElementType FUNCTION = new PrologTokenType("FUNCTION");
  IElementType IDENTIFIER = new PrologTokenType("IDENTIFIER");
  IElementType IMPLIES = new PrologTokenType(":-");
  IElementType LBRACKET = new PrologTokenType("[");
  IElementType LPAREN = new PrologTokenType("(");
  IElementType NUMBER = new PrologTokenType("NUMBER");
  IElementType PIPE = new PrologTokenType("|");
  IElementType RBRACKET = new PrologTokenType("]");
  IElementType RPAREN = new PrologTokenType(")");
  IElementType STRING = new PrologTokenType("STRING");
  IElementType TRUE = new PrologTokenType("true");
  IElementType VAR = new PrologTokenType("VAR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARG) {
        return new PrologArgImpl(node);
      }
      else if (type == ARGLIST) {
        return new PrologArglistImpl(node);
      }
      else if (type == BODYPREDICATE) {
        return new PrologBodypredicateImpl(node);
      }
      else if (type == CLAUSE) {
        return new PrologClauseImpl(node);
      }
      else if (type == ELEMENT) {
        return new PrologElementImpl(node);
      }
      else if (type == ELEMENTLIST) {
        return new PrologElementlistImpl(node);
      }
      else if (type == FACT) {
        return new PrologFactImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new PrologInstructionImpl(node);
      }
      else if (type == LIST) {
        return new PrologListImpl(node);
      }
      else if (type == LITERAL) {
        return new PrologLiteralImpl(node);
      }
      else if (type == PREDICATE) {
        return new PrologPredicateImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
