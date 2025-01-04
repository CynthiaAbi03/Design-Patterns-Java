package builderPattern;

public class PizzaObject {

    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    // Private constructor to ensure the object is only created using the builder
    private PizzaObject(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    // Static inner Builder class
    public static class Builder {
        private String size;
        private String crust;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        // Add cheese topping
        public Builder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        // Add pepperoni topping
        public Builder addPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        // Add mushrooms topping
        public Builder addMushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        // Build the final Pizza object
        public PizzaObject build() {
            return new PizzaObject(this); // Calls private constructor
        }
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", mushrooms=" + mushrooms + "]";
    }

}
