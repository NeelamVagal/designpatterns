package com.learnmyway.designpatterns.factory.simplefactory;

public class PepperoniPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing a pepperoni pizza");
	}

	public void bake() {
		System.out.println("Baking for 10 minutes at 110");
	}

	public void cut() {
		System.out.println("Cutting in triangular pieces");
	}

	public void box() {
		System.out.println("Placing pizza in the box");
	}

}
