package com.liuhongbo.designmode.adapter;

public class Guards extends Player{
	public Guards(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Guards attack");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("Guards defense");
	}
}
