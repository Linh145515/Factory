package composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee, Operations {

    private List<Payee> members = new ArrayList<>();

    @Override
    public void addMembers(Payee p) {
        members.add(p);
    }

    @Override
    public void deleteMembers(Payee p) {
        members.remove(p);
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee member : members) {
            member.payExpenses(amount);
        }
    }
}
