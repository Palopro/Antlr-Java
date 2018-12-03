// Generated from C:/Users/vladh/Desktop/antlr-project/src/main/antlr/com/example/Types\Types.g4 by ANTLR 4.7
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
}