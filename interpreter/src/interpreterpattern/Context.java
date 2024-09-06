package interpreterpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Context {
    private final int yearOfExperience;
    private final List<String> permissibleGrades;

    public Context(int yearOfExperience, String... allowedGrades) {
        this.yearOfExperience = yearOfExperience;
        permissibleGrades = new ArrayList<>();
        permissibleGrades.addAll(Arrays.asList(allowedGrades));
    }

    public int getYearOfExperience() {
        return this.yearOfExperience;
    }

    public List<String> getPermissibleGrades() {
        return this.permissibleGrades;
    }
}
