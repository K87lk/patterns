package factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerType type, String RAM, String HDD, String CPU) {
        switch (type) {
            case PC -> {
                return new PC("32GB", "1TB", "3.2Hhz");
            }
            case SERVER -> {
                return new Server("64GB", "4TB", "5.3Hhz");
            }
        }
        return null;
    }
}
