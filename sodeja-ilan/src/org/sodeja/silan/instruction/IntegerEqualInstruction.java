package org.sodeja.silan.instruction;

import org.sodeja.silan.Process;
import org.sodeja.silan.SILObject;
import org.sodeja.silan.SILPrimitiveObject;
import org.sodeja.silan.context.MethodContext;
import org.sodeja.silan.objects.ImageObjectManager;

public class IntegerEqualInstruction extends PrimitiveInstruction {
	public IntegerEqualInstruction(ImageObjectManager manager) {
		super(manager);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute(Process process) {
		MethodContext mc = (MethodContext) process.getActiveContext();
		
		SILPrimitiveObject<Integer> i1 = (SILPrimitiveObject<Integer>) mc.getReceiver();
		SILPrimitiveObject<Integer> i2 = (SILPrimitiveObject<Integer>) mc.pop();
		
		SILObject result = manager.newBoolean((int) i1.value == (int) i2.value);
		mc.push(result);
	}
}
