package JavaQuestionBank.Melik;

public class Book {
    private String bookId;
    private String author;
    private String tittle;
    private String genre;
    private String publishDate;
    private int availability;

    public Book (String bookId,String author,String tittle, String genre, String publishDate,int availability){
        this.bookId=bookId;
        this.author=author;
        this.tittle=tittle;
        this.genre=genre;
        this.publishDate=publishDate;
        this.availability=availability;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", author='" + author + '\'' +
                ", tittle='" + tittle + '\'' +
                ", genre='" + genre + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", availability=" + availability +
                '}';
    }
}


