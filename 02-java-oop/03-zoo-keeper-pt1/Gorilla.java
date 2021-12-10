public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("That Gorilla has thrown something!");
        energyLevel = energyLevel - 5;
    }

    public void eatBananas() {
        System.out.println("That Gorilla loves eating bananas!");
        energyLevel = energyLevel + 10;
    }

    public void climb() {
        System.out.println("That Gorilla just climbed a tree!");
        energyLevel = energyLevel - 10;
    }
}