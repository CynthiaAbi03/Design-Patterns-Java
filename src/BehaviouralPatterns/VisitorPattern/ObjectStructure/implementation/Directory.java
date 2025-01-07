package BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation;

import BehaviouralPatterns.VisitorPattern.ObjectStructure.Element;
import BehaviouralPatterns.VisitorPattern.Visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Element {
    private String name;
    private List<Element> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Element element) {
        elements.add(element);
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDirectory(this);
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
