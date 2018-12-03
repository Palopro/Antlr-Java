package Types;

public class TypesWalker extends TypesBaseListener {

    public void enterAssigment(TypesParser.AssigmentContext ctx) {
        System.out.println("Enter assigment : " + ctx.type().getText() + " " + ctx.VAR(0) + " = " + ctx.VAR(1));
    }

    public void exitAssigment(TypesParser.AssigmentContext ctx) {
        System.out.println("Exit assigment");
    }

    public void enterArrayRule(TypesParser.ArrayRuleContext ctx) {
        System.out.println("Enter arrayRule : " + ctx.type().getText() + " " + ctx.VAR() + " " + ctx.OPENSQRBRACKET() + ctx.CLOSESQRBRACKET());
    }

    public void exitArrayRule(TypesParser.ArrayRuleContext ctx) {
        System.out.println("Exit arrayRule");
    }

    public void enterClassRule(TypesParser.ClassRuleContext ctx) {
        System.out.println("Enter classRule : " + ctx.CLASS() + " " + ctx.VAR() + " " + ctx.OPENFIGBRACK());
    }

    public void exitClassRule(TypesParser.ClassRuleContext ctx) {
        System.out.println("Exit classRule");
    }

    @Override
    public void enterClassExtendsRule(TypesParser.ClassExtendsRuleContext ctx) {
        System.out.println("Enter classExtendsRule : " + ctx.CLASS().getText() + " " + ctx.VAR(0) + " " + ctx.EXTENDS().getText() + " " + ctx.VAR(1) + " " + ctx.OPENFIGBRACK());
    }

    @Override
    public void exitClassExtendsRule(TypesParser.ClassExtendsRuleContext ctx) {
        System.out.println("Exit classExtendsRule");
    }
}
