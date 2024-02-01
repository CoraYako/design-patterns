package proxypattern;

class ConcreteSubject extends Subject {
    ConcreteSubject() {
    }

    @Override
    public void doSomeWork() {
        System.out.println("The doSomeWork() is executed.");
    }
}
