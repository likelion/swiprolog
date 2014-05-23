package com.github.likelion.swiprolog.psi;

import com.github.likelion.swiprolog.PrologLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PrologElementType extends IElementType {

    public PrologElementType(@NotNull @NonNls String debugName) {
        super(debugName, PrologLanguage.INSTANCE);
    }

}
