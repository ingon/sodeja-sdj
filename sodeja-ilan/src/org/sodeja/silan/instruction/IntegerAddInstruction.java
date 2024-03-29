package org.sodeja.silan.instruction;

import org.sodeja.silan.Process;
import org.sodeja.silan.SILPrimitiveObject;
import org.sodeja.silan.context.MethodContext;
import org.sodeja.silan.objects.ImageObjectManager;

public class IntegerAddInstruction extends PrimitiveInstruction {
	public IntegerAddInstruction(ImageObjectManager manager) {
		super(manager);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute(Process process) {
		MethodContext mc = (MethodContext) process.getActiveContext();
		
		SILPrimitiveObject<Integer> i1 = (SILPrimitiveObject<Integer>) mc.getReceiver();
		SILPrimitiveObject<Integer> i2 = (SILPrimitiveObject<Integer>) mc.pop();
		
		mc.push(manager.newInteger(i1.value + i2.value));
	}
}
