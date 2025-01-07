package StructuralPatterns.ProxyPattern.subject;

import StructuralPatterns.ProxyPattern.Entry;

public interface Folder {
    void display();  // Displays the folder contents
    void addEntry(Entry entry);  // Adds an entry (file or folder)
    void removeEntry(Entry entry);  // Removes an entry
    void synchronize();
}
