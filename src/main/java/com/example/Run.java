package main.java.com.example;

import Calculator.CalculatorLexer;
import Calculator.CalculatorParser;
import Calculator.CalculatorWalker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromStream(System.in);
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();

        CalculatorWalker calcVisitor = new CalculatorWalker();
        Double result = calcVisitor.visit(tree);
        System.out.println("Result: " + result);
    }
}