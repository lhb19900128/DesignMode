package com.liuhongbo.designmode.abstractfactory;

public class AccessIDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("access insert a department");
	}

	@Override
	public void delete(Department department) {
		// TODO Auto-generated method stub
		System.out.println("access delete a department");
	}

}
