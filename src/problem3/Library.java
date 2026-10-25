package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public boolean add(Document doc) {
        if (doc == null || documents.size() >= capacity) {
            return false;
        }
        documents.add(doc);
        return true;
    }


    public boolean delete(Document doc) {
        for (Document d : documents) {
            if (d.getTitle().equals(doc.getTitle())) {
                documents.remove(d);
                return true;
            }
        }
        return false;
    }

    public Document document(int numEnrg) {
        for (Document doc : documents) {
            if (doc.getNumRec() == numEnrg) {
                return doc;
            }
        }
        return null;
    }

    public void displayAuthors() {
        System.out.println("List of authors :");
        for (Document doc : documents) {
            if (doc instanceof Book) {
                Book book = (Book) doc;

                if (book.getAuthor() != null && !book.getAuthor().isBlank()) {
                    System.out.println(book.getAuthor());
                }
            }
        }
    }



    public void displayDocuments() {
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

}
