package com.liuhongbo.designmode.factorymethod;

import java.util.Scanner;


public class IFactoryDemo {
	
	public static void main(String[] args){
		IFactory iFactory = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入运算类型");
		String operateString = scanner.nextLine();
		if("+".equals(operateString.trim()))
			iFactory = new FactoryAdd();
		Operation operation = iFactory.CreateOperation();
		System.out.println("请输入两个数");
		operation.setOperateNumA(scanner.nextDouble());
		operation.setOperateNumB(scanner.nextDouble());
		System.out.println(operation.getResult());
		
		scanner.close();
	}
}


