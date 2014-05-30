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
    if (root_ == CLAUSE) {
      result_ = clause(builder_, 0);
    }
    else if (root_ == DIRECTIVE) {
      result_ = directive(builder_, 0);
    }
    else if (root_ == QUERY) {
      result_ = query(builder_, 0);
    }
    else if (root_ == TERM) {
      result_ = term(builder_, 0);
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
  // arglist2 ( COMMA term )*
  static boolean arglist(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = arglist2(builder_, level_ + 1);
    result_ = result_ && arglist_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( COMMA term )*
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

  // COMMA term
  private static boolean arglist_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // arglist3 [ ( SLASH ATOM )* !(COMMA) ]
  static boolean arglist2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = arglist3(builder_, level_ + 1);
    result_ = result_ && arglist2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ( SLASH ATOM )* !(COMMA) ]
  private static boolean arglist2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist2_1")) return false;
    arglist2_1_0(builder_, level_ + 1);
    return true;
  }

  // ( SLASH ATOM )* !(COMMA)
  private static boolean arglist2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist2_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = arglist2_1_0_0(builder_, level_ + 1);
    result_ = result_ && arglist2_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( SLASH ATOM )*
  private static boolean arglist2_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist2_1_0_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!arglist2_1_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arglist2_1_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // SLASH ATOM
  private static boolean arglist2_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist2_1_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SLASH, ATOM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(COMMA)
  private static boolean arglist2_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist2_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, COMMA);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (DOT !(COMMA)) | term
  static boolean arglist3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = arglist3_0(builder_, level_ + 1);
    if (!result_) result_ = term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT !(COMMA)
  private static boolean arglist3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && arglist3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(COMMA)
  private static boolean arglist3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arglist3_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, COMMA);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // body2
  //                | NOT body
  //                | ONCE LPAREN body RPAREN
  //                | LPAREN body RPAREN [ COMMA body ]
  static boolean body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = body2(builder_, level_ + 1);
    if (!result_) result_ = body_1(builder_, level_ + 1);
    if (!result_) result_ = body_2(builder_, level_ + 1);
    if (!result_) result_ = body_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NOT body
  private static boolean body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOT);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ONCE LPAREN body RPAREN
  private static boolean body_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ONCE, LPAREN);
    result_ = result_ && body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LPAREN body RPAREN [ COMMA body ]
  private static boolean body_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && body_3_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA body ]
  private static boolean body_3_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_3_3")) return false;
    body_3_3_0(builder_, level_ + 1);
    return true;
  }

  // COMMA body
  private static boolean body_3_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_3_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // body3 [ ( IFTHEN | SOFTCUT ) body [ disj body ] ]
  static boolean body2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = body3(builder_, level_ + 1);
    result_ = result_ && body2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ( IFTHEN | SOFTCUT ) body [ disj body ] ]
  private static boolean body2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body2_1")) return false;
    body2_1_0(builder_, level_ + 1);
    return true;
  }

  // ( IFTHEN | SOFTCUT ) body [ disj body ]
  private static boolean body2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body2_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = body2_1_0_0(builder_, level_ + 1);
    result_ = result_ && body(builder_, level_ + 1);
    result_ = result_ && body2_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IFTHEN | SOFTCUT
  private static boolean body2_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body2_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IFTHEN);
    if (!result_) result_ = consumeToken(builder_, SOFTCUT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ disj body ]
  private static boolean body2_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body2_1_0_2")) return false;
    body2_1_0_2_0(builder_, level_ + 1);
    return true;
  }

  // disj body
  private static boolean body2_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body2_1_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = disj(builder_, level_ + 1);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // body4 [ COMMA body ]
  static boolean body3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = body4(builder_, level_ + 1);
    result_ = result_ && body3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA body ]
  private static boolean body3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body3_1")) return false;
    body3_1_0(builder_, level_ + 1);
    return true;
  }

  // COMMA body
  private static boolean body3_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body3_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // body5 [ disj body ]
  static boolean body4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = body5(builder_, level_ + 1);
    result_ = result_ && body4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ disj body ]
  private static boolean body4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body4_1")) return false;
    body4_1_0(builder_, level_ + 1);
    return true;
  }

  // disj body
  private static boolean body4_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body4_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = disj(builder_, level_ + 1);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // body6 [ HAT body ]
  static boolean body5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = body6(builder_, level_ + 1);
    result_ = result_ && body5_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ HAT body ]
  private static boolean body5_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body5_1")) return false;
    body5_1_0(builder_, level_ + 1);
    return true;
  }

  // HAT body
  private static boolean body5_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body5_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, HAT);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // term [ OPERATOR term ]
  static boolean body6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body6")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = term(builder_, level_ + 1);
    result_ = result_ && body6_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ OPERATOR term ]
  private static boolean body6_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body6_1")) return false;
    body6_1_0(builder_, level_ + 1);
    return true;
  }

  // OPERATOR term
  private static boolean body6_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body6_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPERATOR);
    result_ = result_ && term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // head [ IMPLIES body ]
  public static boolean clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clause")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<clause>");
    result_ = head(builder_, level_ + 1);
    result_ = result_ && clause_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLAUSE, result_, false, null);
    return result_;
  }

  // [ IMPLIES body ]
  private static boolean clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clause_1")) return false;
    clause_1_0(builder_, level_ + 1);
    return true;
  }

  // IMPLIES body
  private static boolean clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clause_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPLIES);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPLIES
  //        ( ( "multifile" | "dynamic" ) predspec ( COMMA predspec )*
  //        | body
  //        )
  public static boolean directive(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive")) return false;
    if (!nextTokenIs(builder_, IMPLIES)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPLIES);
    result_ = result_ && directive_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, DIRECTIVE, result_);
    return result_;
  }

  // ( "multifile" | "dynamic" ) predspec ( COMMA predspec )*
  //        | body
  private static boolean directive_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = directive_1_0(builder_, level_ + 1);
    if (!result_) result_ = body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( "multifile" | "dynamic" ) predspec ( COMMA predspec )*
  private static boolean directive_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = directive_1_0_0(builder_, level_ + 1);
    result_ = result_ && predspec(builder_, level_ + 1);
    result_ = result_ && directive_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "multifile" | "dynamic"
  private static boolean directive_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "multifile");
    if (!result_) result_ = consumeToken(builder_, "dynamic");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( COMMA predspec )*
  private static boolean directive_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive_1_0_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!directive_1_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "directive_1_0_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA predspec
  private static boolean directive_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive_1_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && predspec(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SEMICOLON | PIPE
  static boolean disj(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "disj")) return false;
    if (!nextTokenIs(builder_, "", PIPE, SEMICOLON)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, PIPE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // grammarbody2
  //                       | LBRACE body RBRACE
  //                       | NOT grammarbody
  //                       | ONCE LPAREN grammarbody RPAREN
  //                       | LPAREN grammarbody RPAREN [ COMMA grammarbody ]
  static boolean grammarbody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = grammarbody2(builder_, level_ + 1);
    if (!result_) result_ = grammarbody_1(builder_, level_ + 1);
    if (!result_) result_ = grammarbody_2(builder_, level_ + 1);
    if (!result_) result_ = grammarbody_3(builder_, level_ + 1);
    if (!result_) result_ = grammarbody_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE body RBRACE
  private static boolean grammarbody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NOT grammarbody
  private static boolean grammarbody_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOT);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ONCE LPAREN grammarbody RPAREN
  private static boolean grammarbody_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ONCE, LPAREN);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LPAREN grammarbody RPAREN [ COMMA grammarbody ]
  private static boolean grammarbody_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && grammarbody_4_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA grammarbody ]
  private static boolean grammarbody_4_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody_4_3")) return false;
    grammarbody_4_3_0(builder_, level_ + 1);
    return true;
  }

  // COMMA grammarbody
  private static boolean grammarbody_4_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody_4_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // grammarbody3 [ ( IFTHEN | SOFTCUT ) grammarbody [ disj grammarbody ] ]
  static boolean grammarbody2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = grammarbody3(builder_, level_ + 1);
    result_ = result_ && grammarbody2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ( IFTHEN | SOFTCUT ) grammarbody [ disj grammarbody ] ]
  private static boolean grammarbody2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody2_1")) return false;
    grammarbody2_1_0(builder_, level_ + 1);
    return true;
  }

  // ( IFTHEN | SOFTCUT ) grammarbody [ disj grammarbody ]
  private static boolean grammarbody2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody2_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = grammarbody2_1_0_0(builder_, level_ + 1);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    result_ = result_ && grammarbody2_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IFTHEN | SOFTCUT
  private static boolean grammarbody2_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody2_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IFTHEN);
    if (!result_) result_ = consumeToken(builder_, SOFTCUT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ disj grammarbody ]
  private static boolean grammarbody2_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody2_1_0_2")) return false;
    grammarbody2_1_0_2_0(builder_, level_ + 1);
    return true;
  }

  // disj grammarbody
  private static boolean grammarbody2_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody2_1_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = disj(builder_, level_ + 1);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // grammarbody4 [ COMMA grammarbody ]
  static boolean grammarbody3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = grammarbody4(builder_, level_ + 1);
    result_ = result_ && grammarbody3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA grammarbody ]
  private static boolean grammarbody3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody3_1")) return false;
    grammarbody3_1_0(builder_, level_ + 1);
    return true;
  }

  // COMMA grammarbody
  private static boolean grammarbody3_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody3_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // grammarbody5 [ disj grammarbody ]
  static boolean grammarbody4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = grammarbody5(builder_, level_ + 1);
    result_ = result_ && grammarbody4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ disj grammarbody ]
  private static boolean grammarbody4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody4_1")) return false;
    grammarbody4_1_0(builder_, level_ + 1);
    return true;
  }

  // disj grammarbody
  private static boolean grammarbody4_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody4_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = disj(builder_, level_ + 1);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // term [ HAT grammarbody ]
  static boolean grammarbody5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = term(builder_, level_ + 1);
    result_ = result_ && grammarbody5_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ HAT grammarbody ]
  private static boolean grammarbody5_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody5_1")) return false;
    grammarbody5_1_0(builder_, level_ + 1);
    return true;
  }

  // HAT grammarbody
  private static boolean grammarbody5_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grammarbody5_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, HAT);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // term [ ( COMMA terminal )* DCG grammarbody !(IMPLIES) ]
  static boolean head(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "head")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = term(builder_, level_ + 1);
    result_ = result_ && head_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ( COMMA terminal )* DCG grammarbody !(IMPLIES) ]
  private static boolean head_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "head_1")) return false;
    head_1_0(builder_, level_ + 1);
    return true;
  }

  // ( COMMA terminal )* DCG grammarbody !(IMPLIES)
  private static boolean head_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "head_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = head_1_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DCG);
    result_ = result_ && grammarbody(builder_, level_ + 1);
    result_ = result_ && head_1_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( COMMA terminal )*
  private static boolean head_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "head_1_0_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!head_1_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "head_1_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA terminal
  private static boolean head_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "head_1_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && terminal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(IMPLIES)
  private static boolean head_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "head_1_0_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, IMPLIES);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET [ listexpr ] RBRACKET
  static boolean list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && list_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ listexpr ]
  private static boolean list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_1")) return false;
    listexpr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // term [ ( COMMA listexpr ) | ( PIPE term ) ]
  static boolean listexpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listexpr")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = term(builder_, level_ + 1);
    result_ = result_ && listexpr_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ( COMMA listexpr ) | ( PIPE term ) ]
  private static boolean listexpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listexpr_1")) return false;
    listexpr_1_0(builder_, level_ + 1);
    return true;
  }

  // ( COMMA listexpr ) | ( PIPE term )
  private static boolean listexpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listexpr_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = listexpr_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = listexpr_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA listexpr
  private static boolean listexpr_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listexpr_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && listexpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PIPE term
  private static boolean listexpr_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listexpr_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ ATOM COLON ] ATOM
  static boolean modular(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modular")) return false;
    if (!nextTokenIs(builder_, ATOM)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = modular_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ATOM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ATOM COLON ]
  private static boolean modular_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modular_0")) return false;
    parseTokens(builder_, 0, ATOM, COLON);
    return true;
  }

  /* ********************************************************** */
  // modular [ LPAREN arglist RPAREN !(SLASH) ]
  static boolean predicate(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate")) return false;
    if (!nextTokenIs(builder_, ATOM)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = modular(builder_, level_ + 1);
    result_ = result_ && predicate_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ LPAREN arglist RPAREN !(SLASH) ]
  private static boolean predicate_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate_1")) return false;
    predicate_1_0(builder_, level_ + 1);
    return true;
  }

  // LPAREN arglist RPAREN !(SLASH)
  private static boolean predicate_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && arglist(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && predicate_1_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(SLASH)
  private static boolean predicate_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate_1_0_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, SLASH);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // predicate [ SLASH NUMBER ]
  static boolean predicatespec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicatespec")) return false;
    if (!nextTokenIs(builder_, ATOM)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = predicate(builder_, level_ + 1);
    result_ = result_ && predicatespec_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ SLASH NUMBER ]
  private static boolean predicatespec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicatespec_1")) return false;
    parseTokens(builder_, 0, SLASH, NUMBER);
    return true;
  }

  /* ********************************************************** */
  // [ ATOM COLON ] ATOM SLASH [SLASH] NUMBER
  static boolean predspec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predspec")) return false;
    if (!nextTokenIs(builder_, ATOM)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = predspec_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, ATOM, SLASH);
    result_ = result_ && predspec_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, NUMBER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ATOM COLON ]
  private static boolean predspec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predspec_0")) return false;
    parseTokens(builder_, 0, ATOM, COLON);
    return true;
  }

  // [SLASH]
  private static boolean predspec_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predspec_3")) return false;
    consumeToken(builder_, SLASH);
    return true;
  }

  /* ********************************************************** */
  // sentence*
  static boolean prologFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prologFile")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!sentence(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "prologFile", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // PROMPT body
  public static boolean query(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query")) return false;
    if (!nextTokenIs(builder_, PROMPT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROMPT);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUERY, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( list | clause | directive | query ) DOT
  static boolean sentence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sentence")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = sentence_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // list | clause | directive | query
  private static boolean sentence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sentence_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = list(builder_, level_ + 1);
    if (!result_) result_ = clause(builder_, level_ + 1);
    if (!result_) result_ = directive(builder_, level_ + 1);
    if (!result_) result_ = query(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // predicatespec
  //        | LPAREN term RPAREN
  //        | LBRACE term RBRACE
  //        | list
  //        | STRING
  //        | NUMBER
  //        | VAR
  //        | CUT
  public static boolean term(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<term>");
    result_ = predicatespec(builder_, level_ + 1);
    if (!result_) result_ = term_1(builder_, level_ + 1);
    if (!result_) result_ = term_2(builder_, level_ + 1);
    if (!result_) result_ = list(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = consumeToken(builder_, CUT);
    exit_section_(builder_, level_, marker_, TERM, result_, false, null);
    return result_;
  }

  // LPAREN term RPAREN
  private static boolean term_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && term(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE term RBRACE
  private static boolean term_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && term(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // list | STRING
  static boolean terminal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "terminal")) return false;
    if (!nextTokenIs(builder_, "", LBRACKET, STRING)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = list(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
