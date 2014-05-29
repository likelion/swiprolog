package com.github.likelion.swiprolog;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class PrologColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
        new AttributesDescriptor("Keyword", PrologSyntaxHighlighter.KEYWORD),
        new AttributesDescriptor("Special", PrologSyntaxHighlighter.SPECIAL),
        new AttributesDescriptor("Function", PrologSyntaxHighlighter.FUNCTION),
        new AttributesDescriptor("String", PrologSyntaxHighlighter.STRING),
        new AttributesDescriptor("List", PrologSyntaxHighlighter.LIST),
        new AttributesDescriptor("Operator", PrologSyntaxHighlighter.OPERATOR),
        new AttributesDescriptor("Boolean", PrologSyntaxHighlighter.BOOLEAN),
        new AttributesDescriptor("Separator", PrologSyntaxHighlighter.SEPARATOR),
        new AttributesDescriptor("Variable", PrologSyntaxHighlighter.VAR),
        new AttributesDescriptor("Identifier", PrologSyntaxHighlighter.IDENTIFIER),
        new AttributesDescriptor("Number", PrologSyntaxHighlighter.NUMBER),
        new AttributesDescriptor("Comment", PrologSyntaxHighlighter.COMMENT)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return PrologIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new PrologSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "% Comment\n" +
               "a(X) :- b(X), c(X).\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Prolog";
    }

}
