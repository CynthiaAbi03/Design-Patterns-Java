package abstractFactoryPattern;

import abstractFactoryPattern.factory.model.PizzaStoreFactory;
import abstractFactoryPattern.factory.implementation.NewYorkPizzaFactory;
import abstractFactoryPattern.model.Pizza;

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
