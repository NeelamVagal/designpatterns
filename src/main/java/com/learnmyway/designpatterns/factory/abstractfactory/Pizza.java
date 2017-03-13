package com.learnmyway.designpatterns.factory.abstractfactory;

import java.util.Arrays;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Veggies veggies[];
	Clams clam;
	
	abstract void prepare();
	
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", veggies="
				+ Arrays.toString(veggies) + "]";
	}

	
}
