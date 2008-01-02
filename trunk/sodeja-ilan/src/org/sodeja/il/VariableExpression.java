package org.sodeja.il;

public class VariableExpression implements Expression {
	public final String name;

	public VariableExpression(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Var[" + name + "]";
	}
}
