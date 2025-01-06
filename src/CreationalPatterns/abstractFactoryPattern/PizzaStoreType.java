package CreationalPatterns.abstractFactoryPattern;

import CreationalPatterns.abstractFactoryPattern.factory.model.PizzaStoreFactory;
import CreationalPatterns.abstractFactoryPattern.factory.implementation.NewYorkPizzaFactory;
import CreationalPatterns.abstractFactoryPattern.model.Pizza;

public class PizzaStoreType {
    private final PizzaStoreFactory pizzaStoreFactory;

    public PizzaStoreType(PizzaStoreFactory pizzaStoreFactory) {
        this.pizzaStoreFactory = pizzaStoreFactory;
    }

    public Pizza orderPizzaFromStore(String type) {
        Pizza pizza;
        if (type.equals("margherita")) {
            pizza = pizzaStoreFactory.createMargheritaPizza();
        } else if (type.equals("pepperoni")) {
            pizza = pizzaStoreFactory.createPepperoniPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type");
        }
        pizza.bake();
        pizza.box();
        pizza.cut();
        pizza.prepare();
        return pizza;
    };

    public static void main(String[] args) {
        PizzaStoreFactory pizzaStoreFactory1 = new NewYorkPizzaFactory();
        PizzaStoreType pizzaStore = new PizzaStoreType(pizzaStoreFactory1);
        pizzaStore.orderPizzaFromStore("margherita");
    }

}
