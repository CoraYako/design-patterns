package facadepattern;

public class Person {
    public String name;
    double assetValue;
    boolean previousLoanExist;

    public Person(String name, double assetValue, boolean previousLoanExist) {
        this.name = name;
        this.assetValue = assetValue;
        this.previousLoanExist = previousLoanExist;
    }
}
