package proxy;

public class WizardTowerProxy implements WizardTower{
    private static final int ALLOWED_VISITORS = 3;
    private int numOfWizards;
    private final WizardTower wizardTower;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }


    @Override
    public void enter(Wizard wizard) {
        if(numOfWizards < ALLOWED_VISITORS) {
            wizardTower.enter(wizard);
            numOfWizards++;
        }
        else {
            System.out.println(wizard.getName() + " is not allowed to enter");
        }
    }
}
