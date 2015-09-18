package com.liuhongbo.designmode.abstractfactory;

public class MySQLFactory implements IFactory{

	@Override
	public IUser createIUser() {
		// TODO Auto-generated method stub
		return new MySQLIUser();
	}

	@Override
	public IDepartment createIDepartment() {
		// TODO Auto-generated method stub
		return new MySQLIDepartment();
	}

}
