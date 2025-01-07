package BehaviouralPatterns.VisitorPattern.ObjectStructure;

import BehaviouralPatterns.VisitorPattern.Visitor.Visitor;

public interface Element {
    public void accept(Visitor visitor);
}
