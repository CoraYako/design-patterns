package chainofresponsibilitipattern;

public class UnknownErrorHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleMessage(Message message) {
        if (!(message.text.contains("fax") || message.text.contains("email"))) {
            System.out.println("An unknown error occurs. Consult experts immediately.");
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}
