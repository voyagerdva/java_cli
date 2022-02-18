package com.qwertovsky.calculator;
	 
import com.qwertovsky.calculator.operation.Adder;

/**
 * Калькулятор, который умеет складывать
 * @author Qwertovsky
 * 
 */

public class Calculator
{
	/**
	 * Определение суммы слагаемых
	 * @param a массив слагаемых
	 * @return сумма
	 */
	public int sum(int... a)
	{
		Adder adder=new Adder();
		for(int i:a)
		{
			adder.add(i);
		}
		return adder.getSum();
	}
}