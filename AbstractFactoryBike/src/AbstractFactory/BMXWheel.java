package AbstractFactory;

public class BMXWheel implements Wheel {

    @Override
    public void create() {
        System.out.println("Creating BMX Wheel");
    }

}
