package builder;

import java.util.*;

public class House {
    private List<Room> rooms = new ArrayList<>();
    private int floors;

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House [floors=" + floors + ", rooms=" + rooms + "]";
    }
}