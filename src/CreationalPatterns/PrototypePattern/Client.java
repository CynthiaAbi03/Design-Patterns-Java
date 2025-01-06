package CreationalPatterns.PrototypePattern;

import CreationalPatterns.PrototypePattern.implementation.EquilateralTriangle;
import CreationalPatterns.PrototypePattern.implementation.RightAngledTriangle;

public class Client {
    public static void main(String[] args) {
        try {
            // Create initial prototypes
            Triangle equilateralPrototype = new EquilateralTriangle(10, 15);
            Triangle rightAngledPrototype = new RightAngledTriangle(6, 8);

            // Clone and modify Equilateral Triangle
            Triangle clonedEquilateral = equilateralPrototype.clone();
            clonedEquilateral.setBase(12);
            clonedEquilateral.setHeight(18);

            // Clone and modify Right-Angled Triangle
            Triangle clonedRightAngled = rightAngledPrototype.clone();
            clonedRightAngled.setBase(9);
            clonedRightAngled.setHeight(12);

            // Display details of cloned triangles
            System.out.println("Cloned Triangle 1: " + clonedEquilateral.getType() +
                    ", Area: " + clonedEquilateral.calculateArea());
            System.out.println("Cloned Triangle 2: " + clonedRightAngled.getType() +
                    ", Area: " + clonedRightAngled.calculateArea());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
