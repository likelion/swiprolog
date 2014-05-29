// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.likelion.swiprolog.psi.PrologTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.likelion.swiprolog.psi.*;

public class PrologClauseImpl extends ASTWrapperPsiElement implements PrologClause {

  public PrologClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) ((PrologVisitor)visitor).visitClause(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PrologBodypredicate> getBodypredicateList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologBodypredicate.class);
  }

  @Override
  @NotNull
  public PrologPredicate getPredicate() {
    return findNotNullChildByClass(PrologPredicate.class);
  }

}
