package StructuralPatterns.ProxyPattern;

import java.util.Date;

public class Entry {
    private String name;


    public Entry(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Entry: " + name);
    }
    @Override
    public String toString() {
        return "Name: " + name ;
    }
}
