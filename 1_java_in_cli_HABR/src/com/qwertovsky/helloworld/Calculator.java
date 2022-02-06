package com.qwertovsky.helloworld;
	 
import com.qwertovsky.helloworld.operation.Adder;
	 
public class Calculator {
	public int sum(int... a) {
		Adder adder=new Adder();
		for(int i:a) {
			adder.add(i);
		}
		
		return adder.getSum();
	}
}
