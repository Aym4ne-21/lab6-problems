package problem3;

public abstract class Document {
    protected int numRec;
    protected String title;

    private static int counter = 0;

    public Document(String title) {
        this.numRec = ++counter;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Record number: " + numRec
                + ", title: " + title;
    }
}
