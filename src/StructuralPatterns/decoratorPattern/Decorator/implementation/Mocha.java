package StructuralPatterns.decoratorPattern.Decorator.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;
import StructuralPatterns.decoratorPattern.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.50; // mocha cost
    }
}
