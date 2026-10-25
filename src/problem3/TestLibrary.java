package problem3;

import java.util.Scanner;

public class TestLibrary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter library capacity: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Library library = new Library(n);

        library.add(new Novel("1984", "George Orwell", 300, 20.0));
        library.add(new Magazine("Science Monthly", "October", 2026));

        int choice;

        do {
            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. Add a document");
            System.out.println("2. Display documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Search for a document");
            System.out.println("5. Display authors");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter number of pages: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine();

                    Document doc = new Book(title, author, pages);

                    if (library.add(doc)) {
                        System.out.println("Document added.");
                    } else {
                        System.out.println("Library is full.");
                    }
                    break;

                case 2:
                    library.displayDocuments();
                    break;

                case 3:
                    System.out.print("Enter record number to delete: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();

                    Document toDelete = library.document(num);

                    if (toDelete != null && library.delete(toDelete)) {
                        System.out.println("Document deleted.");
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter record number to search: ");
                    num = scanner.nextInt();
                    scanner.nextLine();

                    Document found = library.document(num);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;

                case 5:
                    library.displayAuthors();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
