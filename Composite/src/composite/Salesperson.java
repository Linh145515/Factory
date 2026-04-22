package composite;

public class Salesperson implements Payee {
	private String name;
	private Manager manager;
	
	public Salesperson(String name, Manager manager) {
		this.name = name;
		this.manager = manager;
	}
	@Override
	public void payExpenses (int amount) {
		System.out.println("Salesperson " + name + "Has been paid " + amount + " dollars");
	}

}
