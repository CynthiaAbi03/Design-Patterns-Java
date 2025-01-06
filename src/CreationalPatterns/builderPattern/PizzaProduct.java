package CreationalPatterns.builderPattern;

public class PizzaProduct {

    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "PizzaProduct {" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", cheese=" + (cheese ? "Yes" : "No") +
                ", pepperoni=" + (pepperoni ? "Yes" : "No") +
                ", mushrooms=" + (mushrooms ? "Yes" : "No") +
                '}';
    }


}
