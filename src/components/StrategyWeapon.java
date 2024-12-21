package components;

public class StrategyWeapon extends Weapon {
    @Override
    public void attack() {
        System.out.println("Deploying strategy weapon");
    }
}
