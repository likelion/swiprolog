// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.likelion.swiprolog.psi.impl.*;

public interface PrologTypes {

  IElementType PROPERTY = new PrologElementType("PROPERTY");

  IElementType COMMENT = new PrologTokenType("COMMENT");
  IElementType CRLF = new PrologTokenType("CRLF");
  IElementType KEY = new PrologTokenType("KEY");
  IElementType SEPARATOR = new PrologTokenType("SEPARATOR");
  IElementType VALUE = new PrologTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new PrologPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
