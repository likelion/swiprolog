package com.github.likelion.swiprolog;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class PrologLexerAdapter extends FlexAdapter {
    public PrologLexerAdapter() {
        super(new _PrologLexer((Reader) null));
    }
}
