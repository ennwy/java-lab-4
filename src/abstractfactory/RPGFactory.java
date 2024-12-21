package abstractfactory;

import components.*;

public class RPGFactory implements GameFactory {
    @Override
    public components.Character createCharacter() {
        return new RPGCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new RPGWeapon();
    }

    @Override
    public Level createLevel() {
        return new RPGLevel();
    }
}
