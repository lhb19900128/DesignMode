package com.liuhongbo.designmode.abstractfactory.simplefactory;

public class Main {
	public static void main(String[] args){
		IUser iUser = Database.createIUser();
		User user = new User();
		iUser.insert(user);
		iUser.delete(user);
	}
}
