package com.learnmyway.designpatterns.factory.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom()};
		return veggies;
	}

	public Clams createClam() {
		return new FreshClams();
	}

}
