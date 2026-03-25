package builder;

public class Architect {

    public House constructHouse(HouseBuilder builder) {
        return builder.buildHouse();
    }
}