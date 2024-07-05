package templatemethodpattern;

public class Electronics extends BasicEngineering {
    @Override
    public void courseOnSpecialPaper() {
        System.out.println("3. Digital Logic and Circuit Theory");
    }

    /*
     * Overriding the hook method.
     * The additional paper is not needed
     * for the Electronics students.
     * */
    @Override
    public boolean isAdditionalPaperNeeded() {
        return false;
    }
}
