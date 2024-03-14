package creational.singletonDP.fetch;

public class EagerLoadingSingleton {

    private static final EagerLoadingSingleton instance = new EagerLoadingSingleton();

    private EagerLoadingSingleton() {
        // Private constructor
    }

    public static EagerLoadingSingleton getInstance() {
        System.out.println("Eager Loading Singleton instance created");
        return instance;
    }
}
