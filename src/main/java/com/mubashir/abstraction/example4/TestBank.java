package com.mubashir.abstraction.example4;

public class TestBank {

	public static void main(String[] args) {

		Bank b = new SBI();

		System.out.println("SBI RATE OF INTERST  " + b.getRateOfInterest());

		Bank a = new PNB();
		System.out.println("PNb Rate of interst " + a.getRateOfInterest());

	}

}
