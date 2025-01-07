package BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation;

import BehaviouralPatterns.VisitorPattern.ObjectStructure.Element;
import BehaviouralPatterns.VisitorPattern.Visitor.Visitor;

public class File implements Element {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFile(this);
    }
}
