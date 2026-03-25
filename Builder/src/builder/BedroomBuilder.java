package builder;

public class BedroomBuilder implements RoomBuilder {
    private Bedroom room = new Bedroom();

    public BedroomBuilder setBed(String bed) {
        room.setBed(bed);
        return this;
    }

    public BedroomBuilder setColor(String color) {
        room.setColor(color);
        return this;
    }

    public BedroomBuilder setSize(int size) {
        room.setSize(size);
        return this;
    }

    @Override
    public Room buildRoom() {
        return room;
    }
}