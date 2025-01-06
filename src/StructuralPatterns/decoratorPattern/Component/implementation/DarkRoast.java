package StructuralPatterns.decoratorPattern.Component.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;

public class DarkRoast extends Beverage {
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    public double cost() {
        return 0.99; // base cost of dark roast
    }
}
