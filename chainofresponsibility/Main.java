package com.liuhongbo.designmode.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		Request request = new Request("���", 8, "Ո��8��");
		Manager manager = new CommonManager("jingli", new Majordomo("zongjian",
				new GeneralManager("zongjingli", null)));
		manager.requestApplication(request);
	}
}
