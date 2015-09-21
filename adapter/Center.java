package com.liuhongbo.designmode.adapter;

public class Center extends Player{
	public Center(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Center attack");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("Center defense");
	}
}
