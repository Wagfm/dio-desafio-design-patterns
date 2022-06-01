package br.com.dio.crudeJava.singleton;

/**
 * SingletonLazy class
 *
 * @author Wagner Maciel
 */
public class LazySingleton implements Singleton {
    private static LazySingleton instance;

    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstance() {
        if (instance == null) instance = new LazySingleton();
        return instance;
    }

    @Override
    public void showMessage() {
        System.out.println("This is a lazy singleton instance...");
    }
}
