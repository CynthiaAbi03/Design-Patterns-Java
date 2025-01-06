package CreationalPatterns.builderPattern.director;

import CreationalPatterns.builderPattern.PizzaProduct;
import CreationalPatterns.builderPattern.factory.PizzaBuilder;

public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    //method chaining
    public PizzaProduct constructPizzaProduct() {
        return pizzaBuilder
                .buildSize("Medium")
                .buildCrust("Thin")
                .buildCheese(true)
                .buildPepperoni(true)
                .buildMushrooms(false)
                .build();
    }

}
