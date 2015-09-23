package com.liuhongbo.designmode.visitor;

public class Success implements Action {

	@Override
	public void getManConclusion() {
		System.out.println("man sucess");
	}

	@Override
	public void getWomanConclusion() {
		System.out.println("woman sucess");
	}

}
