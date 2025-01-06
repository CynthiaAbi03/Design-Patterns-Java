package StructuralPatterns.decoratorPattern.Decorator.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;
import StructuralPatterns.decoratorPattern.Decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 0.30; // milk cost
    }
}
