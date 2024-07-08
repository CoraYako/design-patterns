package chainofresponsibilitipattern;

public class EmailErrorHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleMessage(Message message) {
        if (message.text.contains("email")) {
            if (message.text.contains("fax")) {
                // at this pint, the error message contains both: 'email' and 'fax'
                System.out.println("-EmailErrorHandler fixed the email issue: " + message.text);
                System.out.println("--Now FaxErrorHandler needs to cross verify it.");
                if (nextHandler != null) {
                    nextHandler.handleMessage(message);
                }
            } else { // it is an email error only
                System.out.println("EmailErrorHandler processed the issue: " + message.text);
            }
        } else {
            if (nextHandler != null) { // neither an email issue nor a fax issue
                nextHandler.handleMessage(message);
            }
        }
    }
}
