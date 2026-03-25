package AbstractFactory;

public class BikeBuilder {

	public static void main(String[] args) {
		 BikeFactory factory;

	        factory = new MountainBikeFactory();
	        Wheel w1 = factory.getWheel();
	        w1.create();

	        factory = new RoadBikeFactory();
	        Wheel w2 = factory.getWheel();
	        w2.create();
		// TODO Auto-generated method stub
	        //thêm phần mở rộng 3c
	        factory = new BMXBikeFactory();
	        Wheel w3 = factory.getWheel();
	        w3.create();

	}

}
