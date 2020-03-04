// Generated from E:/Work/languages and compilers/ass1/src\gram.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(gramParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(gramParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNormExp(gramParser.NormExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNormExp(gramParser.NormExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMinusExp(gramParser.MinusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMinusExp(gramParser.MinusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(gramParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(gramParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPowExp(gramParser.PowExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPowExp(gramParser.PowExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divMultiExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivMultiExp(gramParser.DivMultiExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divMultiExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivMultiExp(gramParser.DivMultiExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addMinusExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddMinusExp(gramParser.AddMinusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addMinusExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddMinusExp(gramParser.AddMinusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code evalExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEvalExp(gramParser.EvalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code evalExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEvalExp(gramParser.EvalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBracExp(gramParser.BracExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBracExp(gramParser.BracExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(gramParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(gramParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(gramParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(gramParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(gramParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(gramParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(gramParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(gramParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gramParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gramParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDefExp(gramParser.DefExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDefExp(gramParser.DefExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(gramParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(gramParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(gramParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(gramParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#if_start}.
	 * @param ctx the parse tree
	 */
	void enterIf_start(gramParser.If_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#if_start}.
	 * @param ctx the parse tree
	 */
	void exitIf_start(gramParser.If_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#cdn_exp}.
	 * @param ctx the parse tree
	 */
	void enterCdn_exp(gramParser.Cdn_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#cdn_exp}.
	 * @param ctx the parse tree
	 */
	void exitCdn_exp(gramParser.Cdn_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#stat_exp}.
	 * @param ctx the parse tree
	 */
	void enterStat_exp(gramParser.Stat_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#stat_exp}.
	 * @param ctx the parse tree
	 */
	void exitStat_exp(gramParser.Stat_expContext ctx);
}