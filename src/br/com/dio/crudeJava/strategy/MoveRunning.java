package br.com.dio.crudeJava.strategy;

/**
 * MoveRunning class
 *
 * @author Wagner Maciel
 */
public class MoveRunning implements MoveBehaviour {
    @Override
    public void move() {
        System.out.println("Moving at 3 m/s...");
    }
}
