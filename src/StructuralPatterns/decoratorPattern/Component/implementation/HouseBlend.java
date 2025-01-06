package StructuralPatterns.decoratorPattern.Component.implementation;

import StructuralPatterns.decoratorPattern.Component.Beverage;

public class HouseBlend extends Beverage {
    public String getDescription() {
        return "House Blend Coffee";
    }

    public double cost() {
        return 0.89; // base cost of house blend
    }
}
