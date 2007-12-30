package org.sodeja.ilan.lexer;

public class NumberDatum extends LexemeDatum<Number> {
	public NumberDatum(Number value) {
		super(value);
	}

	@Override
	public String toString() {
		return "N(" + value + ")";
	}
}
