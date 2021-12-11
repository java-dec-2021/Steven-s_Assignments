public class HumanTest {
    public static void main(String[] arg) {
        Human human1 = new Human();
        Human human2 = new Human();
        human1.attack(human2);
        Wizard wizard1 = new Wizard();
        Ninja ninja1 = new Ninja();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        wizard1.fireball(ninja1);
        System.out.println(ninja1.health);
        samurai1.deathBlow(wizard1);
        System.out.println(wizard1.health);
        samurai1.meditate();
        System.out.println(samurai1.health);
        ninja1.steal(samurai2);
        System.out.println(samurai2.health);
        System.out.println(ninja1.health);
    }
}