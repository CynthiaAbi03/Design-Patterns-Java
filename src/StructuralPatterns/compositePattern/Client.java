package StructuralPatterns.compositePattern;

public class Client {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new MenuComposite("Pancake Menu");
        MenuComponent breakfastMenu = new MenuComposite("Breakfast Menu");

        breakfastMenu.add(new MenuItemLeaf("Pancakes", "Fluffy pancakes", 5.99));
        breakfastMenu.add(new MenuItemLeaf("Waffles", "Crispy waffles", 6.99));

        MenuComponent lunchMenu = new MenuComposite("Lunch Menu");
        lunchMenu.add(new MenuItemLeaf("Burger", "Cheeseburger with fries", 8.99));
        lunchMenu.add(new MenuItemLeaf("Salad", "Fresh vegetable salad", 7.49));

        pancakeMenu.add(breakfastMenu);
        pancakeMenu.add(lunchMenu);

        pancakeMenu.print();
    }
}
