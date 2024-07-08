package chainofresponsibilitipattern;

public class FaxErrorHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleMessage(Message message) {
        if (message.text.contains("fax")) {
            if (message.text.contains("email")) {
                // at this point, the error message contains both: 'fax' and 'email'
                System.out.println("-FaxErrorHandler fixed the fax issue: " + message.text);
                System.out.println("--Now EmailErrorHandler needs to cross verify it.");
                if (nextHandler != null) { // leaving the responsibility to the next handler: EmailErrorHandler
                    nextHandler.handleMessage(message);
                }
            } else { // it's a fax error only
                System.out.println("FaxErrorHandler processed the issue: " + message.text);
            }
        } else {
            if (nextHandler != null) { // neither a fax issue nor an email issue
                nextHandler.handleMessage(message);
            }
        }
    }
}
