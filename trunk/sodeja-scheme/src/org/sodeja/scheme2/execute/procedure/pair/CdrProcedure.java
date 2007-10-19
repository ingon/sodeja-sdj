package org.sodeja.scheme2.execute.procedure.pair;

import org.sodeja.functional.Pair;
import org.sodeja.scheme2.execute.Procedure;

public class CdrProcedure implements Procedure {
	@SuppressWarnings("unchecked")
	@Override
	public Object apply(Object... values) {
		return ((Pair) values[0]).second;
	}
}