package br.com.dio.crudeJava.strategy;

/**
 * SwingSword class
 *
 * @author Wagner Maciel
 */
public class SwingSword implements SwingWeaponBehaviour {
    @Override
    public void swingWeapon() {
        System.out.println("Swinging sword...");
    }
}
