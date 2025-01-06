package StructuralPatterns.decoratorPattern.Decorator.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;
import StructuralPatterns.decoratorPattern.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + 0.40; // soy cost
    }
}
