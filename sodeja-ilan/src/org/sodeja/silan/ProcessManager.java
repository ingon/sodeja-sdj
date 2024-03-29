package org.sodeja.silan;

import org.sodeja.silan.context.ExecutableContext;

public class ProcessManager {
	
	private final VirtualMachine vm;
	
	public ProcessManager(VirtualMachine vm) {
		this.vm = vm;
	}

	public Process newProcess(CompiledCode code) {
		Process process = new Process(vm);
		process.setActiveContext(new ExecutableContext(process, code));
		return process;
	}
}
