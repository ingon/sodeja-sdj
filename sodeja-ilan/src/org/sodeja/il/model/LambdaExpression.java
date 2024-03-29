package org.sodeja.il.model;

import java.util.List;

import org.sodeja.collections.ListUtils;
import org.sodeja.functional.Function1;
import org.sodeja.il.runtime.ClassContext;
import org.sodeja.il.runtime.Context;
import org.sodeja.il.sdk.ILDefaultClassLambda;
import org.sodeja.il.sdk.ILDefaultFreeLambda;
import org.sodeja.il.sdk.ILObject;
import org.sodeja.il.sdk.ILSymbol;

public class LambdaExpression implements Expression {
	public final List<VariableExpression> params;
	public final Expression expression;
	
	public LambdaExpression(List<VariableExpression> params, Expression expression) {
		this.params = params;
		this.expression = expression;
	}

	@Override
	public ILObject eval(Context ctx) {
		if(ctx instanceof ClassContext) {
			return new ILDefaultClassLambda((ClassContext) ctx, mapToSymbols(), expression);
		}
		return new ILDefaultFreeLambda(ctx, mapToSymbols(), expression);
	}

	private List<ILSymbol> mapToSymbols() {
		return ListUtils.map(params, new Function1<ILSymbol, VariableExpression>() {
			@Override
			public ILSymbol execute(VariableExpression p) {
				return p.name;
			}});
	}

	@Override
	public String toString() {
		return "\\ " + params + "=" + expression;
	}
}
