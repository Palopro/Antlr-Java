package com.example;

import Types.TypesLexer;
import Types.TypesParser;
import Types.TypesWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Types {
    private static TypesLexer typesLexer;
    private static CommonTokenStream tokenStream;
    private static TypesParser typesParser;
    private static ParseTree assigmentTree;

    static ParseTreeWalker typesWalker = new ParseTreeWalker();

    public static void main(String[] args) {
        typesLexer = new TypesLexer(CharStreams.fromString("byte b = 5"));
        tokenStream = new CommonTokenStream((typesLexer));
        typesParser = new TypesParser(tokenStream);
        assigmentTree = typesParser.assigment();
        typesWalker.walk(new TypesWalker(), assigmentTree);
        System.out.println();
        typesLexer = new TypesLexer(CharStreams.fromString("byte b"));
        tokenStream = new CommonTokenStream((typesLexer));
        typesParser = new TypesParser(tokenStream);
        assigmentTree = typesParser.assigment();
        typesWalker.walk(new TypesWalker(), assigmentTree);
        System.out.println();
        typesLexer = new TypesLexer(CharStreams.fromString("byte Array []"));
        tokenStream = new CommonTokenStream((typesLexer));
        typesParser = new TypesParser(tokenStream);
        assigmentTree = typesParser.arrayRule();
        typesWalker.walk(new TypesWalker(), assigmentTree);
        System.out.println();
        typesLexer = new TypesLexer(CharStreams.fromString("class Hello {"));
        tokenStream = new CommonTokenStream(typesLexer);
        typesParser = new TypesParser(tokenStream);
        assigmentTree = typesParser.classRule();
        typesWalker.walk(new TypesWalker(), assigmentTree);
        System.out.println();
        typesLexer = new TypesLexer(CharStreams.fromString("class Hello extends World {"));
        tokenStream = new CommonTokenStream(typesLexer);
        typesParser = new TypesParser(tokenStream);
        assigmentTree = typesParser.classExtendsRule();
        typesWalker.walk(new TypesWalker(), assigmentTree);
        System.out.println();
    }

}
