package iteratorpattern.v1;

public class ArtsDepartment implements Department {
    private final String[] subjects;

    public ArtsDepartment() {
        this.subjects = new String[]{
                "1. English",
                "2. History",
                "3. Geography",
                "4. Psychology"
        };
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
