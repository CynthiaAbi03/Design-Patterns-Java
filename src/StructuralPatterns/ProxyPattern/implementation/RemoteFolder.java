package StructuralPatterns.ProxyPattern.implementation;

import StructuralPatterns.ProxyPattern.Entry;
import StructuralPatterns.ProxyPattern.subject.Folder;

import java.util.ArrayList;
import java.util.List;

public class RemoteFolder implements Folder {
    private List<Entry> entries = new ArrayList<>();
    private String folderName;

    public RemoteFolder(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public void display() {
        System.out.println("Displaying Remote Folder: " + folderName);
        for (Entry entry : entries) {
            entry.display();
        }
    }

    @Override
    public void addEntry(Entry entry) {
        entries.add(entry);
        System.out.println("Added entry to remote folder: " + entry.getName());
    }

    @Override
    public void removeEntry(Entry entry) {
        entries.remove(entry);
        System.out.println("Removed entry from remote folder: " + entry.getName());
    }

    @Override
    public void synchronize() {
        System.out.println("Synchronizing remote folder with local...");
    }
}
