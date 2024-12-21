package tests;

import components.*;
import components.Character;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RPGComponentsTest {

    @Test
    public void testRPGCharacterRender() {
        Character character = new RPGCharacter();
        assertDoesNotThrow(character::render);
    }

    @Test
    public void testRPGWeaponAttack() {
        Weapon weapon = new RPGWeapon();
        assertDoesNotThrow(weapon::attack);
    }

    @Test
    public void testRPGLevelLoad() {
        Level level = new RPGLevel();
        assertDoesNotThrow(level::load);
    }
}
