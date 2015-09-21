package com.liuhongbo.designmode.adapter;

public class Main {
	public static void main(String[] args){
		Forwords forwords = new Forwords("maidi");
		Guards guards = new Guards("aersitong");
		Translator translator = new Translator();
		forwords.attack();
		guards.attack();
		translator.attack();
	}
}
