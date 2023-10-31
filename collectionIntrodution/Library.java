package collectionIntrodution;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library = new ArrayList<Book>();

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void addBook(Book book) {
        if (this.library.contains(book)) {
            MessageManager.printMessage(book.getTitle() + ", já esta cadastrado!");
        } else {
            this.library.add(book);
            MessageManager.printMessage(book.getTitle() + ", cadastrado com sucesso!");
        }
    }

    public void removeBook(Book book) {
        if (library.contains(book)) {
            library.remove(book);
            MessageManager.printMessage(book.getTitle() + ", removido com sucesso!");
        } else {
            MessageManager.printMessage(book.getTitle() + ", não esta na lista!");
        }
    }

    public void printBooksInfo() {
        if (!isEmpty()) {
            for (Book book : library) {
                book.printBookInfo();
            }
        } else {
            MessageManager.printMessage("A lista esta vazia");
        }
    }

    public boolean exists(Book book) {
        if (library.contains(book)) {
            MessageManager.printMessage(book.getTitle() + ", esta cadastrado!");
            return true;
        } else {
            MessageManager.printMessage(book.getTitle() + ", não esta cadastrado!");
            return false;
        }
    }

    public Book getBook(Book book) {
        if (!isEmpty()) {
            for (Book bk : library) {
                if (bk.equals(book)) {
                    return bk;
                }
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (library.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
