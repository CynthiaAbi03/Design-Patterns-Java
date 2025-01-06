package CreationalPatterns.abstractFactoryPattern.factory.implementation;

import CreationalPatterns.abstractFactoryPattern.factory.model.PizzaFactory;
import CreationalPatterns.abstractFactoryPattern.model.Pizza;
import CreationalPatterns.abstractFactoryPattern.model.implementation.PepperoniPizza;

public class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
