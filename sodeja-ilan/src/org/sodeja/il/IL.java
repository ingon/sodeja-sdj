package org.sodeja.il;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class IL {
	public static void main(String[] args) throws IOException {
//		ILLexer lexer = new ILLexer(new FileReader("test/tests.il"));
		ILLexer lexer = new ILLexer(new FileReader("test/fancy.il"));
		List<String> tokens = lexer.tokenize();
		System.out.println(tokens);
		
		ILParser parser = new ILParser();
		Program prog = parser.parse(tokens);
		System.out.println(prog);
	}
}
