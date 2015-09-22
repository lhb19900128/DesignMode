package com.liuhongbo.designmode.chainofresponsibility;

public class CommonManager extends Manager {

	public CommonManager(String name, Manager manager) {
		super(name, manager);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType().equals("���")
				&& request.getRequestNum() < 3) {
			System.out.println("CommonManager��׼��" + request.getRequestContent() + " "
					+ request.getRequestContent() + " "
					+ request.getRequestNum());
		} else {
			this.getManager().requestApplication(request);
		}
	}

}
