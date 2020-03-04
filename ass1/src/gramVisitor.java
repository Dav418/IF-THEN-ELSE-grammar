// Generated from E:/Work/languages and compilers/ass1/src\gram.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(gramParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormExp(gramParser.NormExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExp(gramParser.MinusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(gramParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExp(gramParser.PowExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMultiExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMultiExp(gramParser.DivMultiExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addMinusExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMinusExp(gramParser.AddMinusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExp(gramParser.EvalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracExp(gramParser.BracExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(gramParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(gramParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(gramParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link gramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(gramParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gramParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefExp(gramParser.DefExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(gramParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link gramParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(gramParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#if_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_start(gramParser.If_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#cdn_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdn_exp(gramParser.Cdn_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#stat_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_exp(gramParser.Stat_expContext ctx);
}