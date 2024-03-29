package org.sodeja.explicit;

import org.sodeja.collections.ConsList;

public class Register<T> {
	protected ConsList<T> vals;
	
	public Register() {
		vals = new ConsList<T>(null);
	}
	
	public T getValue() {
		return vals.head();
	}
	
	public void setValue(T value) {
		vals.setHead(value);
	}
	
	public void save() {
		vals = new ConsList<T>(vals.head(), vals);
	}
	
	public void restore() {
		vals = vals.tail();
	}

	@Override
	public String toString() {
		return vals.toString();
	}
}
