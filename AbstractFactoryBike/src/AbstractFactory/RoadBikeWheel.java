package AbstractFactory;

public class RoadBikeWheel implements Wheel {

    @Override
    public void create() {
        System.out.println("Creating Road Bike Wheel");
    }

}