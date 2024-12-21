package tests;

import components.*;
import components.Character;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyComponentsTest {

    @Test
    public void testStrategyCharacterRender() {
        Character character = new StrategyCharacter();
        assertDoesNotThrow(character::render);
    }

    @Test
    public void testStrategyWeaponAttack() {
        Weapon weapon = new StrategyWeapon();
        assertDoesNotThrow(weapon::attack);
    }

    @Test
    public void testStrategyLevelLoad() {
        Level level = new StrategyLevel();
        assertDoesNotThrow(level::load);
    }
}
