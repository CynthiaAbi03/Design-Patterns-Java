package CreationalPatterns.abstractFactoryPattern;

import CreationalPatterns.abstractFactoryPattern.factory.model.PizzaFactory;
import CreationalPatterns.abstractFactoryPattern.factory.implementation.MagheritaPizzaFactory;
import CreationalPatterns.abstractFactoryPattern.model.Pizza;

public class PizzaStore {
    private final PizzaFactory factory;

    //dependency directory
    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza() {
        Pizza pizza = factory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Your pizza is ready!");
    }
    public static void main(String[] args) {
        PizzaFactory magheritaPizzaFactory = new MagheritaPizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(magheritaPizzaFactory);
        pizzaStore.orderPizza();
    }
}
