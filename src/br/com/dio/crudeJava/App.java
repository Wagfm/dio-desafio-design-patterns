package br.com.dio.crudeJava;

import br.com.dio.crudeJava.facade.Facade;
import br.com.dio.crudeJava.singleton.EagerSingleton;
import br.com.dio.crudeJava.singleton.LazySingleton;
import br.com.dio.crudeJava.singleton.LazySingletonHolder;
import br.com.dio.crudeJava.singleton.Singleton;
import br.com.dio.crudeJava.strategy.MoveRunning;
import br.com.dio.crudeJava.strategy.MoveSlowly;
import br.com.dio.crudeJava.strategy.SwingSword;
import br.com.dio.crudeJava.strategy.Warrior;
import br.com.dio.crudeJava.strategy.WarriorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * App class
 *
 * @author Wagner Maciel
 */
public class App {
    public static void main(String[] args) {
        singletonTest();
        System.out.println();
        strategyTest();
        System.out.println();
        facadeTest();
    }

    private static void singletonTest() {
        List<Singleton> singletons = new ArrayList<>();
        singletons.add(LazySingleton.getInstance());
        singletons.add(EagerSingleton.getInstance());
        singletons.add(LazySingletonHolder.getInstance());
        singletons.forEach(Singleton::showMessage);
    }

    private static void strategyTest() {
        WarriorTemplate warrior = new Warrior(new MoveSlowly(), new SwingSword());
        warrior.doAllActions();
        warrior.setMoveBehaviour(new MoveRunning());
        warrior.doAllActions();
    }

    private static void facadeTest() {
        Facade.getFacadeInstance().migrateClient("Wagner", "12345-67");
    }
}
