package AbstractFactory;

public class RoadBikeFactory extends BikeFactory {

    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }

}