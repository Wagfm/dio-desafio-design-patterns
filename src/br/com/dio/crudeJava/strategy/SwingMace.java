package br.com.dio.crudeJava.strategy;

/**
 * SwingMace class
 *
 * @author Wagner Maciel
 */
public class SwingMace implements SwingWeaponBehaviour {
    @Override
    public void swingWeapon() {
        System.out.println("Swinging mace...");
    }
}
