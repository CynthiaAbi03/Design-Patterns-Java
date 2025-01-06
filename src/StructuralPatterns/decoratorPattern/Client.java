package StructuralPatterns.decoratorPattern;

import StructuralPatterns.decoratorPattern.Component.Beverage;
import StructuralPatterns.decoratorPattern.Component.implementation.DarkRoast;
import StructuralPatterns.decoratorPattern.Component.implementation.Espresso;
import StructuralPatterns.decoratorPattern.Component.implementation.HouseBlend;
import StructuralPatterns.decoratorPattern.Decorator.implementation.Milk;
import StructuralPatterns.decoratorPattern.Decorator.implementation.Mocha;
import StructuralPatterns.decoratorPattern.Decorator.implementation.Soy;
import StructuralPatterns.decoratorPattern.Decorator.implementation.Whip;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
