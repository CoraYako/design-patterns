package commandpattern;

public class NumberGenerator {
    private int currentNumber;

    public NumberGenerator() {
        currentNumber = 0;
        System.out.println("The initial number is: " + currentNumber);
        System.out.println("You can increase it, but you cannot decrease it further.");
    }

    public int getMyNumber() {
        return currentNumber;
    }

    public void setMyNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public void incrementNumber() {
        System.out.println(" Received an increment number request.");
        int presentNumber = getMyNumber();
        setMyNumber(currentNumber + 1);
        System.out.println(presentNumber + " + 1 = " + getMyNumber());
    }

    public void decrementNumber() {
        System.out.println(" Received a decrement number request.");
        int presentNumber = this.currentNumber;
        // We started with number 0.
        // We'll not decrease further.
        if (presentNumber > 0) {
            setMyNumber(this.currentNumber - 1);
            System.out.println(presentNumber + " - 1 =" + this.currentNumber);
            System.out.println(" The number is decremented.");
        } else {
            System.out.println("Nothing more to decrement...");
        }
    }
}
