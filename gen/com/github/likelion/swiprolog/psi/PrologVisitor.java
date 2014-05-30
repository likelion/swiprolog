// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class PrologVisitor extends PsiElementVisitor {

  public void visitClause(@NotNull PrologClause o) {
    visitPsiElement(o);
  }

  public void visitDirective(@NotNull PrologDirective o) {
    visitPsiElement(o);
  }

  public void visitQuery(@NotNull PrologQuery o) {
    visitPsiElement(o);
  }

  public void visitTerm(@NotNull PrologTerm o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
