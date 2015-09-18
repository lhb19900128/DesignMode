package com.liuhongbo.designmode.proxy;

public class Persuit implements GiveGift{

	private SchoolGirl schoolGirl;
	
	public Persuit(SchoolGirl schoolGirl) {
		// TODO Auto-generated constructor stub
		this.schoolGirl = schoolGirl;
	}
	
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println(schoolGirl.getName() + "����������");
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(schoolGirl.getName() + "�����ʻ�");
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(schoolGirl.getName() + "�����ɿ���");
	}
	

}
