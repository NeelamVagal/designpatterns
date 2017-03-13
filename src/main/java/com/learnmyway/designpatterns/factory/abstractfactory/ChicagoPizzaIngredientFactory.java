package com.learnmyway.designpatterns.factory.abstractfactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new TomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzerellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	public Clams createClam() {
		return new FrozenClams();
	}

}
