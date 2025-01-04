package builderPattern;

public class BuilderDemo {
    public static void main(String[] args) {
        // Using the Builder to create a customized pizza
        PizzaObject pizzaObject = new PizzaObject.Builder()
                .setSize("Large")
                .setCrust("Thin")
                .addCheese(true)
                .addPepperoni(true)
                .addMushrooms(false)
                .build();
        // Print out the pizza details
        System.out.println(pizzaObject);
    };
}
