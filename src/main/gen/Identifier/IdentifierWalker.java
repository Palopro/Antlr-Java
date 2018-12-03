package Identifier;

public class IdentifierWalker extends IdentifierBaseListener {
    public void enterR(IdentifierParser.RContext ctx) {
        System.out.println("Entering R : " + ctx.VAR().getText());
    }

    public void exitR(IdentifierParser.RContext ctx) {
        System.out.println("Exiting R");
    }
}
