interface Prototype {
    public Prototype clone();
}

class Weapon implements Prototype {
    private String name;
    private int damage;
    private String type;

    public Weapon(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    @Override
    public Weapon clone() {
        return new Weapon(this.name, this.damage, this.type);
    }

    @Override
    public String toString() {
        return "Weapon [Name=" + name + ", Damage=" + damage + ", Type=" + type + "]";
    }
}

class Enemy implements Prototype {
    protected String name;
    protected int health;
    protected int damage;
    protected Weapon weapon; 

    public Enemy(String name, int health, int damage, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weapon = weapon;
    }

    public Enemy clone(){
        return new Enemy(this.name, this.health, this.damage, this.weapon.clone());
    }

    public void displayInfo() {
        System.out.println(this.getClass().getSimpleName() + " [Name=" + name + ", Health=" + health + ", Damage=" + damage + "]");
        System.out.println("Weapon: " + weapon);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}



