import singletonpattern.Captain;

public class SingletonClient {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team.");
        Captain captain1 = Captain.getCaptain();

        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2){
            System.out.println("Both captain1 and captain2 are the same.");
            System.out.println("captain1 hasCode: " + captain1);
            System.out.println("captain2 hasCode: " + captain2);
        }
    }
}