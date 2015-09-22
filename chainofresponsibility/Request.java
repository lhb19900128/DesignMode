package com.liuhongbo.designmode.chainofresponsibility;

public class Request {
	private String requestType;
	private int requestNum;
	private String requestContent;

	public Request(String requestType, int requestNum, String requestContent) {
		this.requestType = requestType;
		this.requestNum = requestNum;
		this.requestContent = requestContent;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public int getRequestNum() {
		return requestNum;
	}

	public void setRequestNum(int requestNum) {
		this.requestNum = requestNum;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

}
