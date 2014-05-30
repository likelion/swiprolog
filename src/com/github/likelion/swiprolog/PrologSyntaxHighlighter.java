package com.github.likelion.swiprolog;

import com.github.likelion.swiprolog.psi.PrologTypes;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PrologSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEYWORD = createTextAttributesKey("PROLOG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey SPECIAL = createTextAttributesKey("PROLOG_SPECIAL", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey FUNCTION = createTextAttributesKey("PROLOG_FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    public static final TextAttributesKey STRING = createTextAttributesKey("PROLOG_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey LIST = createTextAttributesKey("PROLOG_LIST", DefaultLanguageHighlighterColors.LABEL);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("PROLOG_OPERATOR", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BOOLEAN = createTextAttributesKey("PROLOG_BOOLEAN", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("PROLOG_SEPARATOR", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey VAR = createTextAttributesKey("PROLOG_VAR", DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("PROLOG_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("PROLOG_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("PROLOG_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("PROLOG_BAD_CHARACTER", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] SPECIAL_KEYS = new TextAttributesKey[]{SPECIAL};
    private static final TextAttributesKey[] FUNCTION_KEYS = new TextAttributesKey[]{FUNCTION};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] LIST_KEYS = new TextAttributesKey[]{LIST};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] BOOLEAN_KEYS = new TextAttributesKey[]{BOOLEAN};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] VAR_KEYS = new TextAttributesKey[]{VAR};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new _PrologLexer((Reader) null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(PrologTypes.DOT) || tokenType.equals(PrologTypes.IMPLIES) || tokenType.equals(PrologTypes.COMMA)) {
            return SPECIAL_KEYS;
            /*
        } else if (tokenType.equals(PrologTypes.FUNCTION) || tokenType.equals(PrologTypes.PREDICATE)) {
            return FUNCTION_KEYS;
        } else if (tokenType.equals(PrologTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(PrologTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
            */
        } else if (tokenType.equals(PrologTypes.OPERATOR)) {
            return OPERATOR_KEYS;
        } else if (tokenType.equals(PrologTypes.NUMBER)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(PrologTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(PrologTypes.CUT)) {
            return BOOLEAN_KEYS;
        } else if (tokenType.equals(PrologTypes.LPAREN) || tokenType.equals(PrologTypes.RPAREN) ||
                   tokenType.equals(PrologTypes.LBRACKET) || tokenType.equals(PrologTypes.RBRACKET) ||
                   tokenType.equals(PrologTypes.LBRACE) || tokenType.equals(PrologTypes.RBRACE)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(PrologTypes.VAR)) {
            return VAR_KEYS;
        } else if (tokenType.equals(PrologTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }

}
