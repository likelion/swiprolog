package com.github.likelion.swiprolog;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by eleomok on 2014-05-29.
 */
public class PrologLexer extends FlexAdapter {
    public PrologLexer() {
        super(new _PrologLexer());
    }
}
