package interpreterpattern;

public class IndividualEmployee implements Employee {
    private final int experience;
    private final String grade;

    public IndividualEmployee(int experience, String grade) {
        this.experience = experience;
        this.grade = grade;
    }

    @Override
    public boolean interpret(Context context) {
        return experience >= context.getYearOfExperience() &&
                context.getPermissibleGrades().contains(this.grade);
    }

    @Override
    public String toString() {
        return "Experience: " + experience + ", grade: " + grade;
    }
}
