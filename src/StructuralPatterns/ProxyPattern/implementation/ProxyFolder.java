package StructuralPatterns.ProxyPattern.implementation;

import StructuralPatterns.ProxyPattern.Entry;
import StructuralPatterns.ProxyPattern.subject.Folder;

public class ProxyFolder implements Folder {
    private LocalFolder localFolder;
    private RemoteFolder remoteFolder;

    public ProxyFolder(LocalFolder localFolder, RemoteFolder remoteFolder) {
        this.localFolder = localFolder;
        this.remoteFolder = remoteFolder;
    }

    @Override
    public void addEntry(Entry entry) {
        localFolder.addEntry(entry);
        remoteFolder.addEntry(entry);
        synchronize();
    }

    @Override
    public void removeEntry(Entry entry) {
        localFolder.removeEntry(entry);
        remoteFolder.removeEntry(entry);
        synchronize();
    }

    @Override
    public void synchronize() {
        // Synchronize both local and remote folders
        System.out.println("Synchronizing local and remote folders...");
        localFolder.synchronize();
        remoteFolder.synchronize();
    }

    @Override
    public void display() {
        // Ensuring synchronization before display
        synchronize();
        localFolder.display();
        remoteFolder.display();
    }
}
