package chainofresponsibilitipattern;

public interface Handler {
    void nextErrorHandler(Handler nextHandler);

    void handleMessage(Message message);
}
