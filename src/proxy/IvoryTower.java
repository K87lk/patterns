package proxy;

public final class IvoryTower implements WizardTower{
    //singleton implementation
    private IvoryTower() {
    }
    private static final IvoryTower INSTANCE = new IvoryTower();

    public static IvoryTower getInstance() {
        return INSTANCE;
    }

    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.getName() + " enters the tower");
    }
}
