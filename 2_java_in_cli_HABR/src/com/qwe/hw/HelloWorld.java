package com.qwe.hw;

public class HelloWorld {
	public static void main(String[] args) {
    int a=2;
    int b=3;
    Calculator calc=new Calculator();
		System.out.println("Hello World ........... !!!!!");
		System.out.println("Hello World еще раз ... !!!!!");
		System.out.println(a+"+"+b+"="+calc.sum(a,b));
	}
}
