package org.sodeja.il.runtime;

public class ILSymbol extends ILJavaObject<String> {
	public ILSymbol(ILJavaObjectClass type, String value) {
		super(type, value);
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}