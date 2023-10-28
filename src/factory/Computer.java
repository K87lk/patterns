package factory;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer {");
        sb.append("RAM: ");
        sb.append(this.getRAM());
        sb.append(" HDD: ");
        sb.append(this.getHDD());
        sb.append(" CPU: ");
        sb.append(this.getCPU());
        sb.append('}');
        return sb.toString();
    }
}
