package encapsulation.assigment_problems;

public class CharacterHealthBar {

    public static class Character {
        private final int maxHealth;
        private int health;

        public Character(int maxHealth) {
            this.maxHealth = maxHealth;
            this.health = maxHealth;
        }

        public void takeDamage(int amount) {
            if (amount > 0) {
                health -= amount;
                if (health < 0) {
                    health = 0;
                }
            }
        }

        public void heal(int amount) {
            if (amount > 0) {
                health += amount;
                if (health > maxHealth) {
                    health = maxHealth;
                }
            }
        }

        public int getHealth() {
            return health;
        }

        public int getMaxHealth() {
            return maxHealth;
        }
    }

    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        System.out.println("After 30 damage: " + c.getHealth());
        c.heal(50);
        System.out.println("After 50 heal (capped): " + c.getHealth());
        c.takeDamage(150);
        System.out.println("After 150 damage (floored): " + c.getHealth());
    }
}
