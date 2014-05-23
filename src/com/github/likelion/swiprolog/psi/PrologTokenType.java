package com.github.likelion.swiprolog.psi;

import com.github.likelion.swiprolog.PrologLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PrologTokenType extends IElementType {

    public PrologTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PrologLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PrologTokenType." + super.toString();
    }

}
