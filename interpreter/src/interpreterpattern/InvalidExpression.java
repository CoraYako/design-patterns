package interpreterpattern;

public class InvalidExpression implements Employee {
    @Override
    public boolean interpret(Context context) {
        return false; // result is always false
    }
}
