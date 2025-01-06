package StructuralPatterns.decoratorPattern.Decorator;

import StructuralPatterns.decoratorPattern.Component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
