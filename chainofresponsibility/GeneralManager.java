package com.liuhongbo.designmode.chainofresponsibility;

public class GeneralManager extends Manager {

	public GeneralManager(String name, Manager manager) {
		super(name, manager);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType().equals("Çë¼Ù")) {
			System.out.println("GeneralManagerÅú×¼£º"
					+ request.getRequestContent() + " "
					+ request.getRequestContent() + " "
					+ request.getRequestNum());
		} else {
			this.getManager().requestApplication(request);
		}
	}

}
