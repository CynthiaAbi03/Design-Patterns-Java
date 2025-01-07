package BehaviouralPatterns.VisitorPattern.Visitor.implementation;

import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.Directory;
import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.File;
import BehaviouralPatterns.VisitorPattern.Visitor.Visitor;

public class StructurePrinterVisitor implements Visitor {

    private StringBuilder structure = new StringBuilder();
    @Override
    public void visitFile(File file) {
        structure.append("File: ").append(file.getName()).append("\n");
    }

    @Override
    public void visitDirectory(Directory directory) {
        structure.append("Directory: ").append(directory.getName()).append("\n");
    }

    public String getStructure() {
        return structure.toString();
    }
}
