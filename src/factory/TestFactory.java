package factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(
                ComputerType.PC, "32GB", "1TB", "3.4Hhz");
        Computer server = ComputerFactory.getComputer(
                ComputerType.SERVER, "64GB", "2TB", "4.3Hhz");
        System.out.println("PC config: " + pc);
        System.out.println("Server config: " + server);
    }
}
