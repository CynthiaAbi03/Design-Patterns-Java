package CreationalPatterns.abstractFactoryPattern.factory.model;

import CreationalPatterns.abstractFactoryPattern.model.Pizza;

public interface PizzaStoreFactory {
    Pizza createMargheritaPizza();
    Pizza createPepperoniPizza();
}
