package CreationalPatterns.abstractFactoryPattern.factory.implementation;

import CreationalPatterns.abstractFactoryPattern.factory.model.PizzaFactory;
import CreationalPatterns.abstractFactoryPattern.model.Pizza;
import CreationalPatterns.abstractFactoryPattern.model.implementation.MagheritaPizza;

public class MagheritaPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new MagheritaPizza();
    }
}
