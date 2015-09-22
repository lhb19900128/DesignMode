package com.liuhongbo.designmode.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		Request request = new Request("ว๋ผู", 8, "ีผู8ฬ์");
		Manager manager = new CommonManager("jingli", new Majordomo("zongjian",
				new GeneralManager("zongjingli", null)));
		manager.requestApplication(request);
	}
}
