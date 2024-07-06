package observerpattern;

public class SpecificCompany extends Company {
    public SpecificCompany(String companyName) {
        super(companyName);
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
        System.out.println(this.getCompanyName() + " registers " +
                o.getObserverName());
    }

    @Override
    public void unRegister(Observer o) {
        observers.remove(o);
        System.out.println(this.getCompanyName() + " unregisters " +
                o.getObserverName());
    }

    @Override
    void notifyRegisteredUsers() {
        for (Observer observer : observers) {
            observer.getNotification(this);
        }
    }
}
