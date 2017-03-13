package com.learnmyway.designpatterns.factory.abstractfactory;

//Abstract Factory - creates a family of products like dough, sauce, cheese, veggies
public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Clams createClam();
}
