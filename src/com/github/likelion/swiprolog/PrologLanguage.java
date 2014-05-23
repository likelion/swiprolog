package com.github.likelion.swiprolog;

import com.intellij.lang.Language;

public class PrologLanguage extends Language {

    public static final PrologLanguage INSTANCE = new PrologLanguage();

    private PrologLanguage() {
        super("prolog");
    }

}
