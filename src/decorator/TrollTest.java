package decorator;

public class TrollTest {
    public static void main(String[] args) {
        System.out.println("Simple looking troll is approaching...");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power: " + troll.getAttackPower() + "\n");

        System.out.println("A giant troll with a hammer surprises you...");
        var hammerTroll = new HammerTroll(troll);
        hammerTroll.attack();
        hammerTroll.fleeBattle();
        System.out.println("Hammer troll power: " + hammerTroll.getAttackPower());
    }
}
