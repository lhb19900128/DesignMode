package com.liuhongbo.designmode.simplefactory;

import java.util.Scanner;

public class ModeSimpleFactoryDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������");
		Operation operation = null;
		String operateString = scanner.nextLine();

		try {
			operation = OperationFactory.createOperation(operateString);
			System.out.println("������������");
			operation.setOperateNumA(scanner.nextDouble());
			operation.setOperateNumB(scanner.nextDouble());
			try {
				System.out.println(operation.getResult());
			} catch (ArithmeticException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} catch (DefaultException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			scanner.close();
		}

	}
}
