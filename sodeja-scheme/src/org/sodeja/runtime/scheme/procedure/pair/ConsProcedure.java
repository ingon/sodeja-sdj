package org.sodeja.runtime.scheme.procedure.pair;

import org.sodeja.functional.Pair;
import org.sodeja.runtime.Procedure;

public class ConsProcedure implements Procedure {
	@Override
	public Object apply(Object... values) {
		return new Pair<Object, Object>(values[0], values[1]);
	}
}