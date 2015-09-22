package com.liuhongbo.designmode.chainofresponsibility;

public class GeneralManager extends Manager {

	public GeneralManager(String name, Manager manager) {
		super(name, manager);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType().equals("���")) {
			System.out.println("GeneralManager��׼��"
					+ request.getRequestContent() + " "
					+ request.getRequestContent() + " "
					+ request.getRequestNum());
		} else {
			this.getManager().requestApplication(request);
		}
	}

}
