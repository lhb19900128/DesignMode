package com.liuhongbo.designmode.adapter;

public class Translator extends Player{

	ForeignCenter foreignCenter = new ForeignCenter("yaoming");
	
	public Translator() {
		super.setName(foreignCenter.getName());
		// TODO Auto-generated constructor stub
	}

	public Translator(String name) {
		foreignCenter.setName(name);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		foreignCenter.½ø¹¥();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		foreignCenter.·ÀÊØ();
	}

}
