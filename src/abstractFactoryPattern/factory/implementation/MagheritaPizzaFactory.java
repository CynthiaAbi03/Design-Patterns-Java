package abstractFactoryPattern.factory.implementation;

import abstractFactoryPattern.factory.model.PizzaFactory;
import abstractFactoryPattern.model.Pizza;
import abstractFactoryPattern.model.implementation.MagheritaPizza;

public class MagheritaPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new MagheritaPizza();
    }
}
