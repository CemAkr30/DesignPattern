package creational.singletonDP.fetch;

public class LazyLoadingSingleton {

    private static LazyLoadingSingleton instance;

    private LazyLoadingSingleton() {
        // Private constructor
    }

    public static LazyLoadingSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadingSingleton();
            System.out.println("Lazy Loading Singleton instance created");
        }
        return instance;
    }

}
