package CreationalPatterns.builderPattern;

import CreationalPatterns.builderPattern.director.PizzaDirector;
import CreationalPatterns.builderPattern.factory.PizzaBuilder;
import CreationalPatterns.builderPattern.factory.implementation.PizzaConcreteBuilder;

public class ClientCode {

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaConcreteBuilder();
        PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);
        PizzaProduct builtPizza = pizzaDirector.constructPizzaProduct();

        System.out.println(builtPizza);

    };
}
