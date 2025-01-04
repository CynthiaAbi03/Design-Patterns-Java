package abstractFactoryPattern.factory.model;

import abstractFactoryPattern.model.Pizza;

public interface PizzaStoreFactory {
    Pizza createMargheritaPizza();
    Pizza createPepperoniPizza();
}
