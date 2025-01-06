package StructuralPatterns.decoratorPattern.Component.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;

public class Decaf extends Beverage {
    public String getDescription() {
        return "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
