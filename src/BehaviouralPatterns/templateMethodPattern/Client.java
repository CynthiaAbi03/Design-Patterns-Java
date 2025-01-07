package BehaviouralPatterns.templateMethodPattern;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("Making coffee ...");
        coffee.prepareRecipe();


        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
    }


}
