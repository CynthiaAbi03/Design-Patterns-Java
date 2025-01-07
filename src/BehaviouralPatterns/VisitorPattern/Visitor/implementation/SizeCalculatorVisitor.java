package BehaviouralPatterns.VisitorPattern.Visitor.implementation;

import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.Directory;
import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.File;
import BehaviouralPatterns.VisitorPattern.Visitor.Visitor;

public class SizeCalculatorVisitor implements Visitor {
    private int totalSize = 0;

    @Override
    public void visitFile(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visitDirectory(Directory directory) {
        // No size for directories
    }

    public int getTotalSize() {
        return totalSize;
    }
}
