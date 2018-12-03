// Generated from D:/GitHub/antlr-project/src/main/antlr/com/example/Types\Types.g4 by ANTLR 4.7
package Types;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TypesParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypesParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(TypesParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypesParser#arrayRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRule(TypesParser.ArrayRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypesParser#classRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassRule(TypesParser.ClassRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypesParser#classExtendsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtendsRule(TypesParser.ClassExtendsRuleContext ctx);
}