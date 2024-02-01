package proxypattern;

/**
 * This is the proxy class.
 * It invokes the doSomeWork() from
 * the ConcreteSubject.
 */
public class ProxySubject extends Subject {
    private Subject subject;

    public ProxySubject() {
        // We create only one instance
        // of the ConcreteSubject using Singleton Pattern
        subject = getInstance();
    }

    private synchronized Subject getInstance() {
        if (subject == null) {
            subject = new ConcreteSubject();
        }
        return subject;
    }

    @Override
    public void doSomeWork() {
        System.out.println("The proxy call is happening now.");
        subject.doSomeWork();
    }
}
