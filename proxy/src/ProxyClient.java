import proxypattern.ProxySubject;

/**
 * The client is talking to a ConcreteSubject
 * instance through a proxy method.
 */
public class ProxyClient {
    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        // ConcreteSubject has package-private visibility
        // So, you cannot make an instance of it here.
        //Subject cs = new ConcreteSubject();//Error

        ProxySubject subject = new ProxySubject();
        subject.doSomeWork();
    }
}