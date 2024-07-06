package observerpattern;

public interface Observer {
    void getNotification(Company company);

    String getObserverName();

    void registerTo(Company company);

    void unRegisterTo(Company company);
}
