package com.github.likelion.swiprolog;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by eleomok on 2014-05-22.
 */
public class PrologLexerAdapter extends FlexAdapter {
    public PrologLexerAdapter() {
        super(new PrologLexer((Reader) null));
    }
}
