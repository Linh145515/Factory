package AbstractFactory;

public class BMXBikeFactory extends BikeFactory {

    @Override
    public Wheel getWheel() {
        return new BMXWheel();
    }

}