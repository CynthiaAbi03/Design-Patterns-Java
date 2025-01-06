package CreationalPatterns.abstractFactoryPattern.factory.implementation;

import CreationalPatterns.abstractFactoryPattern.factory.model.PizzaStoreFactory;
import CreationalPatterns.abstractFactoryPattern.model.Pizza;
import CreationalPatterns.abstractFactoryPattern.model.implementation.MagheritaPizza;
import CreationalPatterns.abstractFactoryPattern.model.implementation.PepperoniPizza;

public class NewYorkPizzaFactory implements PizzaStoreFactory {

    public Pizza createMargheritaPizza() {
        return new MagheritaPizza();
    }
    public Pizza createPepperoniPizza() {
        return new PepperoniPizza();
    }
}
