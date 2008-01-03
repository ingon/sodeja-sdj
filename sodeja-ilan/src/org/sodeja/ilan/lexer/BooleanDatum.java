package org.sodeja.ilan.lexer;

public class BooleanDatum extends LexemeDatum<Boolean> {
	public BooleanDatum(Boolean value) {
		super(value);
	}
	
	@Override
	public String toString() {
		return "B(" + value + ")";
	}
}