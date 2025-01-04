package singletonPattern;

public class Singleton {
    // Static variable that holds the only instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton(){

    };

    // Public method to get the instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: only create the instance if it's not already created
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public void showMessage(){
        System.out.println("Hello, this is a singleton class!");
    }
}
