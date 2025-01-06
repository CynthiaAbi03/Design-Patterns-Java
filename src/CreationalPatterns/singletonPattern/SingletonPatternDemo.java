package CreationalPatterns.singletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Accessing the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Calling the showMessage method
        singleton.showMessage();

        // Verifying that both references point to the same instance
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton); // true, both refer to the same instance
    }
}
