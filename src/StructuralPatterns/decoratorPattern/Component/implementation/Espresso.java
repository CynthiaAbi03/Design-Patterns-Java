package StructuralPatterns.decoratorPattern.Component.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;

public class Espresso extends Beverage {
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 1.99; // base cost of espresso
    }
}
