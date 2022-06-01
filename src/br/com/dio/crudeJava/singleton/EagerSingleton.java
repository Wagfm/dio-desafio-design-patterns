package br.com.dio.crudeJava.singleton;

/**
 * SingletonLazy class
 *
 * @author Wagner Maciel
 */
public class EagerSingleton implements Singleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    @Override
    public void showMessage() {
        System.out.println("This is a eager singleton instance...");
    }
}
