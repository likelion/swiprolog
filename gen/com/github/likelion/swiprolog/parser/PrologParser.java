// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.github.likelion.swiprolog.psi.PrologTypes.*;
import static com.github.likelion.swiprolog.parser.PrologParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PrologParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.github.likelion.swiprolog.parser.PrologParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ARG) {
      result_ = arg(builder_, 0);
    }
    else if (root_ == ARGLIST) {
      result_ = arglist(builder_, 0);
    }
    else if (root_ == BODYPREDICATE) {
      result_ = bodypredicate(builder_, 0);
    }
    else if (root_ == CLAUSE) {
      result_ = clause(builder_, 0);
    }
    else if (root_ == ELEMENT) {
      result_ = element(builder_, 0);
    }
    else if (root_ == ELEMENTLIST) {
      result_ = elementlist(builder_, 0);
    }
    else if (root_ == FACT) {
      result_ = fact(builder_, 0);
    }
    else if (root_ == INSTRUCTION) {
      result_ = instruction(builder_, 0);
    }
    else if (root_ == LIST) {
      result_ = list(builder_, 0);
    }
    else if (root_ == LITERAL) {
      result_ = literal(builder_, 0);
    }
    else if (root_ == PREDICATE) {
      result_ = predicate(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return prologFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // predicate | VAR | literal | list
  public static boolean arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<arg>");
    result_ = predicate(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARG, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // arg ( COMMA arg )*
  public static boolean arglist(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<arglist>");
    result_ = arg(builder_, level_ + 1);
    result_ = result_ && arglist_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARGLIST, result_, false, null);
    return result_;
  }

  // ( COMMA arg )*
  private static boolean arglist_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!arglist_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arglist_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA arg
  private static boolean arglist_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // predicate | TRUE | FALSE | FAIL | CUT
  public static boolean bodypredicate(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bodypredicate")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<bodypredicate>");
    result_ = predicate(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = consumeToken(builder_, FAIL);
    if (!result_) result_ = consumeToken(builder_, CUT);
    exit_section_(builder_, level_, marker_, BODYPREDICATE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // predicate IMPLIES bodypredicate ( COMMA bodypredicate )* DOT
  public static boolean clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clause")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = predicate(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IMPLIES);
    result_ = result_ && bodypredicate(builder_, level_ + 1);
    result_ = result_ && clause_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, CLAUSE, result_);
    return result_;
  }

  // ( COMMA bodypredicate )*
  private static boolean clause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clause_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!clause_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "clause_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA bodypredicate
  private static boolean clause_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clause_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && bodypredicate(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // predicate | VAR | literal
  public static boolean element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<element>");
    result_ = predicate(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // element ( ( PIPE elementlist ) | ( COMMA element )* )
  public static boolean elementlist(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elementlist")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<elementlist>");
    result_ = element(builder_, level_ + 1);
    result_ = result_ && elementlist_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELEMENTLIST, result_, false, null);
    return result_;
  }

  // ( PIPE elementlist ) | ( COMMA element )*
  private static boolean elementlist_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elementlist_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = elementlist_1_0(builder_, level_ + 1);
    if (!result_) result_ = elementlist_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PIPE elementlist
  private static boolean elementlist_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elementlist_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && elementlist(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( COMMA element )*
  private static boolean elementlist_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elementlist_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!elementlist_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "elementlist_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA element
  private static boolean elementlist_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elementlist_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && element(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // predicate DOT
  public static boolean fact(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fact")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = predicate(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, FACT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPLIES bodypredicate DOT
  public static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    if (!nextTokenIs(builder_, IMPLIES)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPLIES);
    result_ = result_ && bodypredicate(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, INSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET [ elementlist ] RBRACKET
  public static boolean list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && list_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, LIST, result_);
    return result_;
  }

  // [ elementlist ]
  private static boolean list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_1")) return false;
    elementlist(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING | NUMBER
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    if (!nextTokenIs(builder_, "<literal>", NUMBER, STRING)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<literal>");
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    exit_section_(builder_, level_, marker_, LITERAL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ IDENTIFIER COLON ] IDENTIFIER [ LPAREN arglist RPAREN ]
  public static boolean predicate(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = predicate_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && predicate_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PREDICATE, result_);
    return result_;
  }

  // [ IDENTIFIER COLON ]
  private static boolean predicate_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate_0")) return false;
    parseTokens(builder_, 0, IDENTIFIER, COLON);
    return true;
  }

  // [ LPAREN arglist RPAREN ]
  private static boolean predicate_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate_2")) return false;
    predicate_2_0(builder_, level_ + 1);
    return true;
  }

  // LPAREN arglist RPAREN
  private static boolean predicate_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && arglist(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // statement_*
  static boolean prologFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prologFile")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!statement_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "prologFile", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // fact|clause|instruction|COMMENT
  static boolean statement_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fact(builder_, level_ + 1);
    if (!result_) result_ = clause(builder_, level_ + 1);
    if (!result_) result_ = instruction(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
