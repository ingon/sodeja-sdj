package org.sodeja.silan.compiler;

public class UnaryMessage implements Message {
	public final String selector;

	public UnaryMessage(String selector) {
		this.selector = selector;
	}
}
