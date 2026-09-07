import java.util.*;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private double price;
    private String category;

    public Book(String title, String author, double price, String category) {
        this.ISBN = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public static void displayList(List<Book> listOfBooks) {
        System.out.println("List of books available in the system: ");
        for (Book book : listOfBooks) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Dune", "Frank Herbert", 17.99, "Science-Fiction"));
        listOfBooks.add(new Book("1984", "George Orwell", 15.50, "Science-Fiction"));
        listOfBooks.add(new Book("Fondation", "Isaac Asimov", 16.99, "Science-Fiction"));
        listOfBooks.add(new Book("La Guerre des Mondes", "H.G. Wells", 10.99, "Science-Fiction"));

        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1) {

                System.out.println("Enter the title of the book you want to add: ");
                String title = input.nextLine();

                System.out.println("Enter the name of author of the book you want to add: ");
                String author = input.nextLine();

                System.out.println("Enter the category of the book you want to add: ");
                String category = input.nextLine();

                System.out.println("Enter the price of the book you want to add: ");
                double price = Double.parseDouble(input.nextLine());

                Book book = new Book(title, author, price, category);
                listOfBooks.add(book);

                displayList(listOfBooks);
                input.nextLine();
            }
            if (choice == 2) {
                displayList(listOfBooks);

                System.out.println("Enter the ISBN of the book you want to update: ");
                String isbnBookToUpdate = input.nextLine();

                System.out.println("Enter the new title of the book you want to update: ");
                String newTitle = input.nextLine();

                System.out.println("Enter the new category of the book you want to update: ");
                String newCategory = input.nextLine();

                System.out.println("Enter the new price of the book you want to update: ");
                double newPrice = input.nextDouble();

                for (int i = 0; i < listOfBooks.size(); i++) {
                    Book book = listOfBooks.get(i);
                    if (book.ISBN.equals(isbnBookToUpdate)) {
                        book.title = newTitle;
                        book.category = newCategory;
                        book.price = newPrice;
                        listOfBooks.set(i, book);
                        break;
                    }
                }

                displayList(listOfBooks);

            } else if (choice == 3) {
                displayList(listOfBooks);

                System.out.println("Enter the ISBN of the book you want to delete: ");
                String isbnBookToDelete = input.nextLine();

                for (int i = 0; i < listOfBooks.size(); i++) {
                    Book book = listOfBooks.get(i);
                    if (book.ISBN.equals(isbnBookToDelete)) {
                        listOfBooks.remove(i);
                        return;
                    }
                }

                displayList(listOfBooks);
            }
             else if (choice == 4) {
                System.out.println("List of books available in the system: ");
                System.out.println(listOfBooks);

                System.out.println("Enter the ISBN of the book you want to search for: ");
                String isbnBookToSearch = input.nextLine();

                for (Book book : listOfBooks) {
                    if (book.ISBN.equals(isbnBookToSearch)) {
                        System.out.println(book);
                        return;
                    }
                }

            }
             else if (choice == 5) {

                listOfBooks.sort(Comparator.comparing(book -> book.title));
                displayList(listOfBooks);

            }
             else if (choice == 6) {
                 listOfBooks.sort(Comparator.comparing(book -> book.price));
                displayList(listOfBooks);
            }
             else {
                 break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("1. Add a book");
        System.out.println("2. Update a book");
        System.out.println("3. Delete a book");
        System.out.println("4. Search for a books");
        System.out.println("5. Sort books by title");
        System.out.println("6. Sort books by price");
        System.out.println("7. Quit");
        System.out.println();
        System.out.println("Enter your choice: ");
    }
}
