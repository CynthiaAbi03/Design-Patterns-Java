package abstractFactoryPattern.factory.implementation;

import abstractFactoryPattern.factory.model.PizzaStoreFactory;
import abstractFactoryPattern.model.Pizza;
import abstractFactoryPattern.model.implementation.MagheritaPizza;
import abstractFactoryPattern.model.implementation.PepperoniPizza;

public class NewYorkPizzaFactory implements PizzaStoreFactory {

    public Pizza createMargheritaPizza() {
        return new MagheritaPizza();
    }
    public Pizza createPepperoniPizza() {
        return new PepperoniPizza();
    }
}
