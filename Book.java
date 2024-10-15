public class Book extends LibaryItem {
    private String author;
    private int isbn;

    public Book(int isbn,String title,String author,int yearPublished) {
        super(title, yearPublished);
        this.isbn = isbn;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getDetail() {
        return "[Isbn: "+isbn+", title: "+ getTitle()+", Author: "+author+", YearPublished: "+getYearPublished()+"]";
        
    }
}
