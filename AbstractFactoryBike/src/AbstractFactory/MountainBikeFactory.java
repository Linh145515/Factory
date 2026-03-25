package AbstractFactory;

public class MountainBikeFactory extends BikeFactory {

    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }

}