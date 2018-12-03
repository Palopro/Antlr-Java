// Generated from D:/GitHub/antlr-project/src/main/antlr/com/example/Types\Types.g4 by ANTLR 4.7
package Types;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypesParser}.
 */
public interface TypesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TypesParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TypesParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(TypesParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(TypesParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#arrayRule}.
	 * @param ctx the parse tree
	 */
	void enterArrayRule(TypesParser.ArrayRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#arrayRule}.
	 * @param ctx the parse tree
	 */
	void exitArrayRule(TypesParser.ArrayRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#classRule}.
	 * @param ctx the parse tree
	 */
	void enterClassRule(TypesParser.ClassRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#classRule}.
	 * @param ctx the parse tree
	 */
	void exitClassRule(TypesParser.ClassRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#classExtendsRule}.
	 * @param ctx the parse tree
	 */
	void enterClassExtendsRule(TypesParser.ClassExtendsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#classExtendsRule}.
	 * @param ctx the parse tree
	 */
	void exitClassExtendsRule(TypesParser.ClassExtendsRuleContext ctx);
}