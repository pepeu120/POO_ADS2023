package collectionIntrodution;

public class Book {
    private int isbn;
    private String author;
    private String publishing;
    private String title;

    public Book(int isbn, String author, String publishing, String title) {
        this.isbn = isbn;
        this.author = author;
        this.publishing = publishing;
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + isbn;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (isbn != other.isbn)
            return false;
        return true;
    }

    public void printBookInfo() {
        System.out.printf("""
                ISBN: %d
                Author: %s
                Publishing: %s
                Title: %s
                """, getIsbn(), getAuthor(), getPublishing(), getTitle());
    }
}
