package singletonpattern;

public final class Captain {
    private static Captain captain;

    // Making the constructor private
    // to prevent the use of "new"
    private Captain() {
    }

    // Synchronized for a multithreading environment
    public static synchronized Captain getCaptain() {
        // Lazy initialization
        if (captain == null) {
            captain = new Captain();
            System.out.println("\tA new captain is elected for your team.");
        } else {
            System.out.println("\tYou already have a captain for your team.");
            System.out.println("\tSend him for the toss.");
        }
        return captain;
    }
}
