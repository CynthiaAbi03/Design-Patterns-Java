package BehaviouralPatterns.VisitorPattern.Visitor;

import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.Directory;
import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.File;

public interface Visitor {
    void visitFile(File file);
    void visitDirectory(Directory directory);
}
