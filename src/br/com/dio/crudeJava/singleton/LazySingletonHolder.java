package br.com.dio.crudeJava.singleton;

/**
 * LazySingletonHolder class
 *
 * @author Wagner Maciel
 */
public class LazySingletonHolder implements Singleton {
    private static class InstanceHolder {
        public static LazySingletonHolder instance = new LazySingletonHolder();
    }

    private LazySingletonHolder() {
        super();
    }

    public static LazySingletonHolder getInstance() {
        return InstanceHolder.instance;
    }

    @Override
    public void showMessage() {
        System.out.println("This is a lazy singleton holder instance...");
    }
}
