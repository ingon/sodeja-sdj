package org.sodeja.silan.instruction;

import org.sodeja.silan.Process;
import org.sodeja.silan.SILObject;

public class PushIntegerLiteralInstruction implements Instruction {
	public final Integer value;
	
	public PushIntegerLiteralInstruction(Integer value) {
		this.value = value;
	}

	@Override
	public void execute(Process process) {
		SILObject obj = process.vm.getObjectManager().newInteger(value);
		process.getActiveContext().push(obj);
	}
}