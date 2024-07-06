import observerpattern.*;

public class ObserverClient {
    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demonstration ***");
        // we have 4 different observers
        Observer roy = new Employee("Roy");
        Observer kevin = new Employee("Kevin");
        Observer bose = new Customer("Bose");
        Observer jack = new Customer("Jack");
        System.out.println("Working with the company: ABC Ltd.");

        Company abcLtd = new SpecificCompany("ABC Ltd.");
        // registering the observers - Roy, Kevin, Bose
        abcLtd.register(roy);
        abcLtd.register(kevin);
        abcLtd.register(bose);
        System.out.println("ABC Ltd.'s current stock price is $5.");
        abcLtd.setStockPrice(5);
        System.out.println("----------------------------------");

        // Kevin doesn't want to get further notification.
        System.out.println("ABC Ltd. is removing Kevin from the observer list now.");
        abcLtd.unRegister(kevin);
        // no notification is sent to Kevin anymore.
        System.out.println("ABC Ltd.'s new stock price is $50.");
        abcLtd.setStockPrice(50);
        System.out.println("----------------------------------");
        System.out.println("Kevin registers again to get notification from ABC Ltd.");
        abcLtd.register(kevin);

        System.out.println("ABC Ltd.'s new stock price is $100");
        abcLtd.setStockPrice(100);
        System.out.println("----------------------------------");

        // creating another company
        Company xyzCo = new SpecificCompany("XYZ Co.");
        // registering observers Roy and Jack
        xyzCo.register(roy);
        xyzCo.register(jack);
        System.out.println("XYZ Co.'s new stock price is $500");
        xyzCo.setStockPrice(500);

        Company industryLtd = new SpecificCompany("Industry Ltd.");
        roy.registerTo(industryLtd);
        kevin.registerTo(industryLtd);
    }
}