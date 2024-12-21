package tests;

import components.*;
import components.Character;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShooterComponentsTest {

    @Test
    public void testShooterCharacterRender() {
        Character character = new ShooterCharacter();
        assertDoesNotThrow(character::render);
    }

    @Test
    public void testShooterWeaponAttack() {
        Weapon weapon = new ShooterWeapon();
        assertDoesNotThrow(weapon::attack);
    }

    @Test
    public void testShooterLevelLoad() {
        Level level = new ShooterLevel();
        assertDoesNotThrow(level::load);
    }
}
