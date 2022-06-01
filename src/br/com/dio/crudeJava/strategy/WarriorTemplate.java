package br.com.dio.crudeJava.strategy;

/**
 * WarriorTemplate interface
 *
 * @author Wagner Maciel
 */
public interface WarriorTemplate {

    void move();

    void swingWeapon();

    void setMoveBehaviour(MoveBehaviour moveBehaviour);

    void setSwingWeaponBehaviour(SwingWeaponBehaviour swingWeaponBehaviour);

    void doAllActions();
}
