package BehaviouralPatterns.templateMethodPattern;

public abstract class Beverage {

    // Template method that defines the skeleton of making a beverage
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (hook()) {
            addCondiments();
        }
    }

    // Common steps for all beverages
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods for steps that vary in different beverages
    protected abstract void brew();
    protected abstract void addCondiments();
    
    // Hook method to allow subclasses to decide if condiments should be added
    protected boolean hook() {
        return true; // Default behavior is to add condiments
    }
}
