package observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {
    List<Observer> observers = new ArrayList<>();
    private String companyName;
    private int stockPrice;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getStockPrice() {
        return this.stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        // The stock price is changed
        // so, notify the observer(s).
        notifyRegisteredUsers();
    }

    // to register an observer
    public abstract void register(Observer o);

    // to unregister an observer
    public abstract void unRegister(Observer o);

    // to notify registered users
    abstract void notifyRegisteredUsers();
}
