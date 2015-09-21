package com.liuhongbo.designmode.component;

public class Main {
	public static void main(String[] args){
		Composite root = new Composite("root");
		root.add(new Leaf("leaf a"));
		root.add(new Leaf("leaf b"));
		
		Composite composite = new Composite("composite x");
		composite.add(new Leaf("leaf xa"));
		composite.add(new Leaf("leaf xb"));
		root.add(composite);
		
		Composite composite2 = new Composite("composite xy");
		composite2.add(new Leaf("leaf xya"));
		composite2.add(new Leaf("leaf xyb"));
		composite.add(composite2);
		
		root.add(new Leaf("leaf c"));
		Leaf leaf = new Leaf("leaf d");
		root.add(leaf);
		root.delete(leaf);
		root.dispaly(2);
		
	}
}
