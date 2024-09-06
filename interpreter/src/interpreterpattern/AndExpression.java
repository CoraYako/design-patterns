package interpreterpattern;

public class AndExpression implements Employee {
    private final Employee emp1;
    private final Employee emp2;

    public AndExpression(Employee emp1, Employee emp2) {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    @Override
    public boolean interpret(Context context) {
        return emp1.interpret(context) && emp2.interpret(context);
    }
}
