package abstractfactory;

import components.Character;
import components.Weapon;
import components.Level;

public interface GameFactory {
    Character createCharacter();
    Weapon createWeapon();
    Level createLevel();
}
