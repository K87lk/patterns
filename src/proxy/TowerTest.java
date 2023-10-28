package proxy;

public class TowerTest {
    public static void main(String[] args) {
        WizardTower tower = new WizardTowerProxy(IvoryTower.getInstance());
        tower.enter(new Wizard("Red wizard"));
        tower.enter(new Wizard("White wizard"));
        tower.enter(new Wizard("Black wizard"));
        tower.enter(new Wizard("Green wizard"));
        tower.enter(new Wizard("Brown wizard"));
    }
}
