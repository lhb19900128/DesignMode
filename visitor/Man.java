package com.liuhongbo.designmode.visitor;

public class Man extends Person{

	@Override
	public void accept(Action action) {
		action.getManConclusion();
	}

}
