package decorator;

public class HammerTroll implements Troll{
    private final Troll troll;

    public HammerTroll(Troll troll) {
        this.troll = troll;
    }

    @Override
    public void attack() {
        System.out.println("The troll tries to stab you with a hammer");
    }

    @Override
    public int getAttackPower() {
        return troll.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away");
    }
}
