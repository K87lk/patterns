package adapter;

public class CardReader implements USB{
    private final MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUSBCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
