package builder;

public class HouseBuilder {
    private House house = new House();

    public HouseBuilder addRoom(Room r) {
        house.addRoom(r);
        return this;
    }

    public HouseBuilder setFloors(int n) {
        house.setFloors(n);
        return this;
    }

    public House buildHouse() {
        return house;
    }
}