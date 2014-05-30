package com.github.likelion.swiprolog.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;

public class PrologParserUtil extends GeneratedParserUtilBase {

    public static boolean checkN(PsiBuilder builder, int level, int N) {
        System.out.println("checkN("+level+","+N+")");
        return true;
    }

}
