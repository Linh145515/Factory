package facade;

public class Client {

    public static void main(String[] args) {
        VacationFacade facade = new VacationFacade();

        facade.bookBudgetVacation();
        
        System.out.println("------------------");
        
        facade.bookLuxuryVacation();
    }
}