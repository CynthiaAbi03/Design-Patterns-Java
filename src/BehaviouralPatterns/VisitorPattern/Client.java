package BehaviouralPatterns.VisitorPattern;

import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.Directory;
import BehaviouralPatterns.VisitorPattern.ObjectStructure.implementation.File;
import BehaviouralPatterns.VisitorPattern.Visitor.implementation.SizeCalculatorVisitor;
import BehaviouralPatterns.VisitorPattern.Visitor.implementation.StructurePrinterVisitor;

public class Client {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        File file1 = new File("File1.txt", 10);
        File file2 = new File("File2.txt", 20);

        Directory subDir = new Directory("SubDir");
        File file3 = new File("File3.txt", 15);

        root.add(file1);
        root.add(file2);
        root.add(subDir);
        subDir.add(file3);

        // Visitors
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        StructurePrinterVisitor printVisitor = new StructurePrinterVisitor();

        root.accept(sizeVisitor);
        root.accept(printVisitor);

        System.out.println("Total Size: " + sizeVisitor.getTotalSize());
        System.out.println("Structure: ");
        System.out.println(printVisitor.getStructure());
    }
}
