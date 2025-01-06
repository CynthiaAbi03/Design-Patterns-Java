package CreationalPatterns.PrototypePattern.implementation;

import CreationalPatterns.PrototypePattern.Triangle;

public class RightAngledTriangle implements Triangle{
    private double base;
    private double height;

    public RightAngledTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Triangle clone() throws CloneNotSupportedException {
        return (RightAngledTriangle) super.clone();
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getType() {
        return "Right-Angled Triangle";
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
