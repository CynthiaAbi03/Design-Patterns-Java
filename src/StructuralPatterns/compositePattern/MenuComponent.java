package StructuralPatterns.compositePattern;

public abstract class MenuComponent {
    public String getName() { return ""; }
    public String getDescription() { return ""; }
    public double getPrice() { return 0.0; }
    public void add(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    public void remove(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    public void print() { throw new UnsupportedOperationException(); }
}
