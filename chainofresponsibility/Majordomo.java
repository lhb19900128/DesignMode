package com.liuhongbo.designmode.chainofresponsibility;

public class Majordomo extends Manager {

	public Majordomo(String name, Manager manager) {
		super(name, manager);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType().equals("���")
				&& request.getRequestNum() < 6) {
			System.out.println("Majordomo��׼��" + request.getRequestContent() + " "
					+ request.getRequestContent() + " "
					+ request.getRequestNum());
		} else {
			this.getManager().requestApplication(request);
		}
	}

}
