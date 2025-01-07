package BehaviouralPatterns.templateMethodPattern;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea leaves");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon to tea");
    }
}
