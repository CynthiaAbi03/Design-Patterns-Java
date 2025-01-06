package StructuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class MenuComposite extends MenuComponent{
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;

    public MenuComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("Menu: " + name);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
