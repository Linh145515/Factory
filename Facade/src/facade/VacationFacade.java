package facade;

public class VacationFacade {

    private VehicleBooking vehicle;
    private HotelBooking hotel;
    private FlightBooking flight;

    public VacationFacade() {
        vehicle = new VehicleBooking();
        hotel = new HotelBooking();
        flight = new FlightBooking();
    }

    public void bookBudgetVacation() {
        System.out.println("Booking Budget Vacation...");
        vehicle.bookBicycle();
        hotel.standardRoom();
        flight.oneWay();
    }

    public void bookLuxuryVacation() {
        System.out.println("Booking Luxury Vacation...");
        vehicle.bookCar();
        hotel.luxuryRoom();
        flight.roundTrip();
    }
}