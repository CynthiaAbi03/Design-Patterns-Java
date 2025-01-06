package StructuralPatterns.decoratorPattern.Decorator.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;
import StructuralPatterns.decoratorPattern.Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.70; // whip cost
    }
}
