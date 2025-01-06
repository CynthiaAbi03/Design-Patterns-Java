package CreationalPatterns.builderPattern.factory.implementation;

import CreationalPatterns.builderPattern.PizzaProduct;
import CreationalPatterns.builderPattern.factory.PizzaBuilder;

public class PizzaConcreteBuilder implements PizzaBuilder {
    private PizzaProduct pizzaProduct;

    public PizzaConcreteBuilder() {
        this.pizzaProduct = new PizzaProduct();
    }

    @Override
    public PizzaBuilder buildSize(String size) {
        pizzaProduct.setSize(size);
        return this;
    };

    @Override
    public PizzaBuilder buildCrust(String crust) {
        pizzaProduct.setCrust(crust);
        return this;
    }

    @Override
    public PizzaBuilder buildCheese (boolean cheese) {
        pizzaProduct.setCheese(cheese);
        return this;
    }

    @Override
    public PizzaBuilder buildPepperoni (boolean pepperoni) {
        pizzaProduct.setPepperoni(pepperoni);
        return this;
    }

    @Override
    public PizzaBuilder buildMushrooms (boolean mushrooms) {
        pizzaProduct.setMushrooms(mushrooms);
        return this;
    }

    @Override
    public PizzaProduct build() {
        return pizzaProduct;
    }


}
