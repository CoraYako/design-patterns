package implementation_3;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {
    public void sendInsuranceMail(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending mail about theft insurance...");
    }

    @Override
    public void visitCompany(Company company) {
        System.out.println("Sending employees and equipment insurance mail...");
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Sending mail about medical insurance...");
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Sending mail about fire and food insurance...");
    }
}
