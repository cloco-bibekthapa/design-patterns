public class Main {
    public static void main(String[] args) {

        Weapon sword = new Weapon("Sword", 30, "Melee");
        Weapon bow = new Weapon("Bow", 20, "Ranged");

        Enemy zombiePrototype = new Enemy("Zombie King", 100, 15, sword);
        Enemy orcPrototype = new Enemy("Orc Warrior", 120, 25, bow);

        Enemy clonedZombie = zombiePrototype.clone();
        Enemy clonedOrc = orcPrototype.clone();

        zombiePrototype.displayInfo();
        orcPrototype.displayInfo();;
        
        // Display the cloned enemies with weapons
        clonedZombie.displayInfo();
        clonedOrc.displayInfo();

        // Clone more enemies
        Enemy clonedZombie2 = zombiePrototype.clone();
        clonedZombie2.displayInfo();
    }
}
