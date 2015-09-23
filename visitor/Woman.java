package com.liuhongbo.designmode.visitor;

public class Woman extends Person{

	@Override
	public void accept(Action action) {
		action.getWomanConclusion();
	}

}
