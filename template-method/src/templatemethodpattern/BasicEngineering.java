package templatemethodpattern;

public abstract class BasicEngineering {
    /*
     * The following method will be the "Template Method"
     * and is final to prevent overriding.
     * */
    public final void displayCourseStructure() {
        /*
         * The course needs to be completed in the
         * following sequence:
         * 1. Mathematics
         * 2. Soft Skills
         * 3. Subclass-specific paper
         * 4. Additional paper, if any
         * */
        // common papers:
        courseOnMathematics(); // step 1
        courseOnSoftSkills(); // step 2
        // course-specific paper:
        courseOnSpecialPaper(); // step 3
        if (isAdditionalPaperNeeded()) {
            courseOnAdditionalPaper(); // step 4
        }
    }

    private void courseOnMathematics() {
        System.out.println("1. Mathematics");
    }

    private void courseOnSoftSkills() {
        System.out.println("2. Soft Skills");
    }

    /*
     * The following method will vary.
     * It will be overridden by the
     * derived classes.
     * */
    public abstract void courseOnSpecialPaper();

    private void courseOnAdditionalPaper() {
        System.out.println("4. Compiler construction");
    }

    /*
    * A hook method.
    * By default, an additional subject is needed
    * */
    public boolean isAdditionalPaperNeeded() {
        return true;
    }
}
