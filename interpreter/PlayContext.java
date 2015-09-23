package com.liuhongbo.designmode.interpreter;

public class PlayContext {
	private String context;
	
	public PlayContext(String context){
		this.context = context;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
	public int length(){
		return context.length();
	}
}
