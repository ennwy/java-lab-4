package tests;

import abstractfactory.*;
import components.*;
import components.Character;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    @Test
    public void testShooterFactory() {
        GameFactory factory = new ShooterFactory();
        components.Character character = factory.createCharacter();
        Weapon weapon = factory.createWeapon();
        Level level = factory.createLevel();

        assertNotNull(character);
        assertNotNull(weapon);
        assertNotNull(level);

        assertInstanceOf(ShooterCharacter.class, character);
        assertInstanceOf(ShooterWeapon.class, weapon);
        assertInstanceOf(ShooterLevel.class, level);
    }

    @Test
    public void testRPGFactory() {
        GameFactory factory = new RPGFactory();
        Character character = factory.createCharacter();
        Weapon weapon = factory.createWeapon();
        Level level = factory.createLevel();

        assertNotNull(character);
        assertNotNull(weapon);
        assertNotNull(level);

        assertInstanceOf(RPGCharacter.class, character);
        assertInstanceOf(RPGWeapon.class, weapon);
        assertInstanceOf(RPGLevel.class, level);
    }

    @Test
    public void testStrategyFactory() {
        GameFactory factory = new StrategyFactory();
        Character character = factory.createCharacter();
        Weapon weapon = factory.createWeapon();
        Level level = factory.createLevel();

        assertNotNull(character);
        assertNotNull(weapon);
        assertNotNull(level);

        assertInstanceOf(StrategyCharacter.class, character);
        assertInstanceOf(StrategyWeapon.class, weapon);
        assertInstanceOf(StrategyLevel.class, level);
    }
}
