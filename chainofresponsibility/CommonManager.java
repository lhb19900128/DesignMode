package com.liuhongbo.designmode.chainofresponsibility;

public class CommonManager extends Manager {

	public CommonManager(String name, Manager manager) {
		super(name, manager);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType().equals("Çë¼Ù")
				&& request.getRequestNum() < 3) {
			System.out.println("CommonManagerÅú×¼£º" + request.getRequestContent() + " "
					+ request.getRequestContent() + " "
					+ request.getRequestNum());
		} else {
			this.getManager().requestApplication(request);
		}
	}

}
