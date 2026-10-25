package problem3;

public class Textbook extends Book{
    public String level;

    public Textbook(String title, String author, int nbrPages, String level) {
        super(title, author, nbrPages);
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + ", level: " + level;
    }
}
