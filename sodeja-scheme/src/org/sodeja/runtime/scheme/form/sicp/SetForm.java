package org.sodeja.runtime.scheme.form.sicp;

import org.sodeja.runtime.Evaluator;
import org.sodeja.runtime.scheme.SchemeExpression;
import org.sodeja.runtime.scheme.SchemeForm;
import org.sodeja.runtime.scheme.SchemeFrame;
import org.sodeja.runtime.scheme.model.Combination;
import org.sodeja.runtime.scheme.model.Symbol;

public class SetForm extends SchemeForm {
	@Override
	protected Object evalDelegate(Evaluator<SchemeExpression> evaluator,
			SchemeFrame frame, Combination expression) {
		if(expression.size() != 2) {
			throw new IllegalArgumentException("Should give a variable and an expression!");
		}

		SchemeExpression varExpression = expression.get(1);
		if(! (varExpression instanceof Symbol)) {
			throw new IllegalArgumentException("Should give a variable and an expression!");
		}
		
		Object value = evaluator.eval(frame, expression.get(1));
		frame.setObject(varExpression, value);
		return value;
	}
}
