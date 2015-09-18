package com.liuhongbo.designmode.abstractfactory;

public class MySQLIDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("mysql insert a department");
	}

	@Override
	public void delete(Department department) {
		// TODO Auto-generated method stub
		System.out.println("mysql delete a department");
	}

}
