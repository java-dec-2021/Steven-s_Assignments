public class Bat extends Mammal {

    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("Woosh! That Bat has flown away!");
        energyLevel = energyLevel - 50;
    }

    public void eatHumans() {
        System.out.println("Yikes! That Bat just ate some humans!");
        energyLevel = energyLevel + 25;
    }

    public void attackTown() {
        System.out.println("That Bat just attacked that town! It's now on fire!");
        energyLevel = energyLevel - 100;
    }
}