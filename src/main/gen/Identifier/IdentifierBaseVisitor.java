// Generated from C:/Users/vladh/Desktop/antlr-project/src/main/antlr/com/example/Identifier\Identifier.g4 by ANTLR 4.7
package Identifier;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link IdentifierVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class IdentifierBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements IdentifierVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitR(IdentifierParser.RContext ctx) { return visitChildren(ctx); }
}