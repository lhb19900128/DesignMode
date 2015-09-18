package com.liuhongbo.designmode.abstractfactory;

public class AccessFactory implements IFactory{

	@Override
	public IUser createIUser() {
		// TODO Auto-generated method stub
		return new AccessIUser();
	}

	@Override
	public IDepartment createIDepartment() {
		// TODO Auto-generated method stub
		return new AccessIDepartment();
	}

}
