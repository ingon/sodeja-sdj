package org.sodeja.explicit2;

import java.io.StringReader;
import java.util.List;

import org.sodeja.parser.SchemeParser;
import org.sodeja.runtime.procedure.arithmetic.SubProcedure;
import org.sodeja.runtime.procedure.logical.NotProcedure;
import org.sodeja.runtime.procedure.relational.LessThenProcedure;
import org.sodeja.runtime.scheme.SchemeExpression;
import org.sodeja.runtime.scheme.model.Combination;
import org.sodeja.runtime.scheme.model.Symbol;

public class Main {
	public static void main(String[] args) throws Exception {
		SchemeParser<Symbol, Combination> parser = SchemeParser.parser(Symbol.class, Combination.class);
//		List<SchemeExpression> expressions = parser.tokenize(new StringReader("3"));
		List<SchemeExpression> expressions = parser.tokenize(new StringReader("3 (define a 3) a"));
//		List<SchemeExpression> expressions = parser.tokenize(new FileReader("scripts/gabriel-scheme/tak.sch"));
		
		Machine machine = new Machine();
		Compiler compiler = new Compiler();
		Enviroment enviroment = new Enviroment();
		enviroment.define(new Symbol("not"), new NotProcedure());
		enviroment.define(new Symbol("<"), new LessThenProcedure());
		enviroment.define(new Symbol("-"), new SubProcedure());
		
		for(SchemeExpression expr : expressions) {
			System.out.println("->: " + expr);
			long start = System.currentTimeMillis();
			CompiledExpression compiled = compiler.compile(expr);
			Object obj = machine.eval(compiled, enviroment);
			long end = System.currentTimeMillis();
			System.out.println("=>: " + obj);
			System.out.println("(" + (end - start) + ")");
		}
	}
}