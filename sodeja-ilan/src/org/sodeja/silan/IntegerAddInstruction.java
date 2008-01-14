package org.sodeja.silan;

public class IntegerAddInstruction extends PrimitiveInstruction {
	public IntegerAddInstruction(ObjectManager manager) {
		super(manager, 1);
	}

	@Override
	public void execute(Process process) {
		MethodContext mc = (MethodContext) process.getActiveContext();
		
		SILPrimitiveObject<Integer> i1 = (SILPrimitiveObject<Integer>) mc.getReceiver();
		SILPrimitiveObject<Integer> i2 = (SILPrimitiveObject<Integer>) mc.get(0);
		
		Integer primitiveResult = i1.value + i2.value;
		SILObject result = manager.newInteger(primitiveResult);
		process.getActiveContext().set(1, result);
	}
}
