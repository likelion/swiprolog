package com.github.likelion.swiprolog.psi;

import com.github.likelion.swiprolog.PrologFileType;
import com.github.likelion.swiprolog.PrologLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PrologFile extends PsiFileBase {

    public PrologFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PrologLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PrologFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Prolog File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

}
