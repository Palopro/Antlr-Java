// Generated from C:/Users/vladh/Desktop/antlr-project/src/main/antlr/com/example/Identifier\Identifier.g4 by ANTLR 4.7
package Identifier;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IdentifierParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IdentifierVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IdentifierParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(IdentifierParser.RContext ctx);
}