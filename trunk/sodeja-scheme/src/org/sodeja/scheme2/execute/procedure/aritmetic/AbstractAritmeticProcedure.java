package org.sodeja.scheme2.execute.procedure.aritmetic;

import org.sodeja.math.Rational;
import org.sodeja.runtime.Procedure;

public abstract class AbstractAritmeticProcedure implements Procedure {
	protected Rational convert(Object obj) {
		if(obj instanceof Rational) {
			return (Rational) obj;
		}
		
		throw new IllegalArgumentException("Wrong value type: " + obj.getClass());
	}
}
