package org.sodeja.il.runtime;

import java.util.List;

public class ILNotFoundLambda implements ILClassLambda {

	public static final ILSymbol NAME = SDK.getInstance().makeSymbol("methodMissing");
	
	private final ILSymbol name;
	
	public ILNotFoundLambda(ILSymbol name) {
		this.name = name;
	}
	
	@Override
	public ILObject applyObject(ILObject value, List<ILObject> values) {
		throw new UnsupportedOperationException("Method is missing: " + name);
	}

	@Override
	public ILClass getType() {
		throw new UnsupportedOperationException();
	}
}