// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PrologArg extends PsiElement {

  @Nullable
  PrologList getList();

  @Nullable
  PrologLiteral getLiteral();

  @Nullable
  PrologPredicate getPredicate();

  @Nullable
  PsiElement getVar();

}
