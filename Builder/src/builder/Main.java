package builder;

public class Main {
    public static void main(String[] args) {

        Room bedroom = new BedroomBuilder()
                .setBed("King")
                .setColor("Blue")
                .setSize(25)
                .buildRoom();

        Room kitchen = new KitchenBuilder()
                .setStove("Gas")
                .setSink("Modern")
                .buildRoom();

        HouseBuilder builder = new HouseBuilder()
                .setFloors(2)
                .addRoom(bedroom)
                .addRoom(kitchen);

        Architect architect = new Architect();
        House house = architect.constructHouse(builder);

        System.out.println(house);
    }
}