package com.liuhongbo.designmode.adapter;

public class ForeignCenter {
	private String name;

	public ForeignCenter(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void ½ø¹¥(){
		System.out.println(this.name + " ½ø¹¥");
	}
	
	public void ·ÀÊØ(){
		System.out.println(this.name + " ·ÀÊØ");
	}

}
