package abstractfactory;

import components.*;

public class StrategyFactory implements GameFactory {
    @Override
    public components.Character createCharacter() {
        return new StrategyCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new StrategyWeapon();
    }

    @Override
    public Level createLevel() {
        return new StrategyLevel();
    }
}
