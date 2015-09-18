package com.liuhongbo.designmode.proxy;

public class Proxy implements GiveGift{

	private Persuit persuit;
	
	public Proxy(SchoolGirl schoolGirl) {
		persuit = new Persuit(schoolGirl);
	}
	
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		persuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		persuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		persuit.GiveChocolate();
	}

}
