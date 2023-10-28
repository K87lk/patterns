package abstract_factory;

public class Test {
    Kingdom kingdom = new Kingdom();
    public Kingdom getKingdom() {
        return kingdom;
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        System.out.println(test.kingdom.getArmy().getDescription());
        System.out.println(test.kingdom.getCastle().getDescription());
        System.out.println(test.kingdom.getKing().getDescription());

        test.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        System.out.println(test.kingdom.getArmy().getDescription());
        System.out.println(test.kingdom.getCastle().getDescription());
        System.out.println(test.kingdom.getKing().getDescription());

    }
    public void createKingdom(Kingdom.FactoryMaker.KingdomType kingdomType) {
        KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}
