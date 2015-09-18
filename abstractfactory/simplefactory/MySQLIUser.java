package com.liuhongbo.designmode.abstractfactory.simplefactory;

public class MySQLIUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("mysql insert a user");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("mysql delete a user");
	}
}
