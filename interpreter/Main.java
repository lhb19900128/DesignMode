package com.liuhongbo.designmode.interpreter;

public class Main {
	public static void main(String[] args) {
		Expression expression = null;
		PlayContext context = new PlayContext("O 2 E 0.5 F 0.5 C 1 O 1 F 0.5 ");
		while (context.length() > 0) {
			String string = context.getContext().substring(0, 1);

			if (string.equals("O")) {
				expression = new Scale();
			} else if (string.equals("C")) {
				expression = new Note();
			} else if (string.equals("D")) {
				expression = new Note();
			} else if (string.equals("E")) {
				expression = new Note();
			} else if (string.equals("F")) {
				expression = new Note();
			} else if (string.equals("G")) {
				expression = new Note();
			} else if (string.equals("A")) {
				expression = new Note();
			} else if (string.equals("B")) {
				expression = new Note();
			}else {
				continue;
			}
			expression.interpreter(context);
		}
	}
}
