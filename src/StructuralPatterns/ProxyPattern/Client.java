package StructuralPatterns.ProxyPattern;

import StructuralPatterns.ProxyPattern.implementation.LocalFolder;
import StructuralPatterns.ProxyPattern.implementation.ProxyFolder;
import StructuralPatterns.ProxyPattern.implementation.RemoteFolder;

public class Client {
    public static void main(String[] args) {
        // Creating Local and Remote folders
        LocalFolder localFolder = new LocalFolder("Local Folder 1");
        RemoteFolder remoteFolder = new RemoteFolder("Remote Folder 1");

        // Creating a Proxy to manage synchronization between Local and Remote folders
        ProxyFolder proxyFolder = new ProxyFolder(localFolder, remoteFolder);

        // Creating entries to add to the folders
        Entry file1 = new Entry("File1.txt");
        Entry file2 = new Entry("File2.txt");

        // Adding entries and synchronizing
        proxyFolder.addEntry(file1);
        proxyFolder.addEntry(file2);

        // Display folders and synchronize
        proxyFolder.display();

        // Removing an entry and synchronizing again
        proxyFolder.removeEntry(file1);
        proxyFolder.display();
    }
}
