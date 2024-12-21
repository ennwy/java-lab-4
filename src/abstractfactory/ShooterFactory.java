package abstractfactory;

import components.*;

public class ShooterFactory implements GameFactory {
    @Override
    public components.Character createCharacter() {
        return new ShooterCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new ShooterWeapon();
    }

    @Override
    public Level createLevel() {
        return new ShooterLevel();
    }
}
