package BehaviouralPatterns.templateMethodPattern;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing coffee grounds");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk to coffee");
    }
}
