package builder;

public class KitchenBuilder implements RoomBuilder {
    private Kitchen room = new Kitchen();

    public KitchenBuilder setStove(String stove) {
        room.setStove(stove);
        return this;
    }

    public KitchenBuilder setSink(String sink) {
        room.setSink(sink);
        return this;
    }

    @Override
    public Room buildRoom() {
        return room;
    }
}