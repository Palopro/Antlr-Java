package com.example;

import Hello.HelloLexer;
import Hello.HelloParser;
import Hello.HelloWalker;
import Identifier.IdentifierLexer;
import Identifier.IdentifierParser;
import Identifier.IdentifierWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {
    public static void main(String[] args) {
        HelloLexer helloLexer = new HelloLexer(CharStreams.fromString("hello world"));
        CommonTokenStream helloLexerTokens = new CommonTokenStream(helloLexer);
        HelloParser parser = new HelloParser(helloLexerTokens);
        ParseTree HelloTree = parser.r();
        ParseTreeWalker helloWalker = new ParseTreeWalker();
        helloWalker.walk(new HelloWalker(), HelloTree);

        IdentifierLexer identifierLexer = new IdentifierLexer(CharStreams.fromString("$i6Dentifier;"));
        CommonTokenStream identifierTokens = new CommonTokenStream((identifierLexer));
        IdentifierParser identifierParser = new IdentifierParser(identifierTokens);
        ParseTree identifierTree = identifierParser.r();
        ParseTreeWalker idenWalker = new ParseTreeWalker();
        idenWalker.walk(new IdentifierWalker(), identifierTree);

    }
}