package adapter;


public class Client {
    public static void main(String[] args) {
        PriceCalculator car = new CarPriceCalculator(10000.0);
        PriceCalculator truck = new TruckPriceCalculator(20000.0);
        PriceCalculator ukCar = new UKCarPriceAdapter(15000.0);

        System.out.println("Car price: " + car.calculatePrice());
        System.out.println("Truck price: " + truck.calculatePrice());
        System.out.println("UK Car price: " + ukCar.calculatePrice());
    }
}