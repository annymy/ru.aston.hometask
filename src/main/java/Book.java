import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int pages;
    private int year;

    public Book(@JsonProperty("title") String title,
                @JsonProperty("author") String author,
                @JsonProperty("pages") int pages,
                @JsonProperty("year") int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title  +
                " " + author +
                " " + pages + " стр. " +
                year + " год";
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.getPages(), o.getPages());
    }

    @Override
    public boolean equals(Object o) { //в задании не было сказано, по каким полям сравнивать. для меня важны только автор и название
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
