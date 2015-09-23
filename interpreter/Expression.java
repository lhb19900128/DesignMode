package com.liuhongbo.designmode.interpreter;

public abstract class Expression {
	public void interpreter(PlayContext context) {
		if (context.length() == 0) {
			return;
		} else {
			String key = context.getContext().substring(0, 1);
			context.setContext(context.getContext().substring(2));
			double value = Double.parseDouble(context.getContext().substring(0,
					context.getContext().indexOf(" ")));
			context.setContext(context.getContext().substring(
					context.getContext().indexOf(" ") + 1));
			excute(key, value);
		}
	}
	
	public abstract void excute(String key,double value);
}
