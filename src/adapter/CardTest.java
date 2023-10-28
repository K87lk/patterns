package adapter;

public class CardTest {
    public static void main(String[] args) {
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUSBCable();

    }
}
