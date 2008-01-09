package org.sodeja.sil.model;

public class BinaryMessage {
	public final BinaryMessageSelector selector;
	public final BinaryMessageOperand operand;
	
	public BinaryMessage(BinaryMessageSelector selector, BinaryMessageOperand operand) {
		this.selector = selector;
		this.operand = operand;
	}
}
