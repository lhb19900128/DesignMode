package com.liuhongbo.designmode.abstractfactory.simplefactory;

public class AccessIUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("access insert a user");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("access delete a user");
	}
}
