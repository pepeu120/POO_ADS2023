package collectionIntrodution;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book(
                978054400,
                "J.R.R. Tolkien",
                "Houghton Mifflin",
                "The Hobbit");
        Book book2 = new Book(
                978026110,
                "J.R.R. Tolkien",
                "HarperCollins",
                "The Lord of the Rings");
        Book book3 = new Book(
                97807393,
                "J.K. Rowling",
                "Listening Library",
                "Harry Potter and the Sorcerer's Stone");
        Book book4 = new Book(
                97805455,
                "J.K. Rowling",
                "Arthur A. Levine Books",
                "Harry Potter and the Chamber of Secrets");
        Book book5 = new Book(
                97805903,
                "J.K. Rowling",
                "Scholastic",
                "Harry Potter and the Prisoner of Azkaban");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.printBooksInfo();

        if (library.exists(book3)) {
            System.out.println("Livro 3 está na biblioteca.");
        } else {
            System.out.println("Livro 3 não está na biblioteca.");
        }

        Book retrievedBook = library.getBook(book1);
        if (retrievedBook != null) {
            System.out.println("Informações do livro obtido:");
            retrievedBook.printBookInfo();
        } else {
            System.out.println("Livro 1 não encontrado na biblioteca.");
        }

        library.removeBook(book4);

        if (library.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("A biblioteca não está vazia.");
        }
    }
}
