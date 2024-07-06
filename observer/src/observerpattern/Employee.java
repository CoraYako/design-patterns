package observerpattern;

public class Employee implements Observer {
    private String observerName;

    public Employee(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void getNotification(Company company) {
        System.out.println(observerName + " has recived an alert from " +
                company.getCompanyName());
        System.out.println("The current stock price is: $" +
                company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return observerName;
    }

    @Override
    public void registerTo(Company company) {
        company.register(this);
        System.out.println(this.observerName + " registered himself/herself to " +
                company.getCompanyName());

    }

    @Override
    public void unRegisterTo(Company company) {
        company.unRegister(this);
        System.out.println(this.observerName + " unregistered himself/herself to " +
                company.getCompanyName());
    }
}
