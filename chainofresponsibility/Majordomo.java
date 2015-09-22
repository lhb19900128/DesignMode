package com.liuhongbo.designmode.chainofresponsibility;

public class Majordomo extends Manager {

	public Majordomo(String name, Manager manager) {
		super(name, manager);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType().equals("Çë¼Ù")
				&& request.getRequestNum() < 6) {
			System.out.println("MajordomoÅú×¼£º" + request.getRequestContent() + " "
					+ request.getRequestContent() + " "
					+ request.getRequestNum());
		} else {
			this.getManager().requestApplication(request);
		}
	}

}
