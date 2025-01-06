package CreationalPatterns.builderPattern.factory;

import CreationalPatterns.builderPattern.PizzaProduct;

public interface PizzaBuilder {
    PizzaBuilder buildSize(String size);
    PizzaBuilder buildCrust (String crust);
    PizzaBuilder buildCheese (boolean cheese);
    PizzaBuilder buildPepperoni (boolean pepperoni);
    PizzaBuilder buildMushrooms (boolean mushrooms);
    PizzaProduct build();
}
