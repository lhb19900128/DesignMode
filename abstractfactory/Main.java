package com.liuhongbo.designmode.abstractfactory;

public class Main {
	public static void main(String[] args){
		IFactory iFactory = new AccessFactory();
		IUser iUser = iFactory.createIUser();
		IDepartment iDepartment = iFactory.createIDepartment();
		User user = new User();
		Department department = new Department();
		iUser.insert(user);
		iUser.delete(user);
		iDepartment.insert(department);
		iDepartment.delete(department);
	}
}
