import abstractfactory.*;
import components.*;
import components.Character;
import systems.*;

public class Main {
    public static void main(String[] args) {
        // Select a game genre
        GameFactory factory = new ShooterFactory();

        // Create game components
        Character character = factory.createCharacter();
        Weapon weapon = factory.createWeapon();
        Level level = factory.createLevel();

        // Use systems
        GraphicsSystem graphics = new GraphicsSystem();
        PhysicsSystem physics = new PhysicsSystem();
        AISystem ai = new AISystem();

        // Simulate game
        character.render();
        weapon.attack();
        level.load();

        graphics.renderGraphics();
        physics.simulatePhysics();
        ai.processAI();
    }
}
