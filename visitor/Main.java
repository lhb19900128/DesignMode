package com.liuhongbo.designmode.visitor;

public class Main {
	public static void main(String[] args){
		Action action = new Success();
		ObjectStructure objectStructure  = new ObjectStructure();
		objectStructure.add(new Man());
		
		Woman woman = new Woman();
		objectStructure.add(woman);
		objectStructure.show(action);
		
		objectStructure.remove(woman);
		objectStructure.show(action);
	}
}
