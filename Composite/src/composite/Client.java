package composite;

public class Client {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Alice");
        Manager manager2 = new Manager("Bob");

        Salesperson s1 = new Salesperson("John", manager1);
        Salesperson s2 = new Salesperson("Mary", manager2);

        SalesTeam team = new SalesTeam();

        team.addMembers(manager1);
        team.addMembers(manager2);
        team.addMembers(s1);
        team.addMembers(s2);

        team.payExpenses(1000);
    }
}