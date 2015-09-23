package com.liuhongbo.designmode.visitor;

public class Fail implements Action {

	@Override
	public void getManConclusion() {
		System.out.println("man fail");
	}

	@Override
	public void getWomanConclusion() {
		System.out.println("woman fail");
	}

}
