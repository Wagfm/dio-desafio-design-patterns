package br.com.dio.crudeJava.strategy;

/**
 * Warrior class
 *
 * @author Wagner Maciel
 */
public class Warrior implements WarriorTemplate {

    private MoveBehaviour moveBehaviour;
    private SwingWeaponBehaviour swingWeaponBehaviour;

    public Warrior(MoveBehaviour moveBehaviour, SwingWeaponBehaviour swingWeaponBehaviour) {
        this.moveBehaviour = moveBehaviour;
        this.swingWeaponBehaviour = swingWeaponBehaviour;
    }

    @Override
    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }

    @Override
    public void setSwingWeaponBehaviour(SwingWeaponBehaviour swingWeaponBehaviour) {
        this.swingWeaponBehaviour = swingWeaponBehaviour;
    }

    @Override
    public void move() {
        moveBehaviour.move();
    }

    @Override
    public void swingWeapon() {
        swingWeaponBehaviour.swingWeapon();
    }

    @Override
    public void doAllActions() {
        move();
        swingWeapon();
    }
}
