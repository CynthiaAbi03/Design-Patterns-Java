package abstractFactoryPattern.factory.implementation;

import abstractFactoryPattern.factory.model.PizzaFactory;
import abstractFactoryPattern.model.Pizza;
import abstractFactoryPattern.model.implementation.PepperoniPizza;

public class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
