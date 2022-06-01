package br.com.dio.crudeJava.strategy;

/**
 * MoveSlowly class
 *
 * @author Wagner Maciel
 */
public class MoveSlowly implements MoveBehaviour {

    @Override
    public void move() {
        System.out.println("Moving at 1 m/s...");
    }
}
