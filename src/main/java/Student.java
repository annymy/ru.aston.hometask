import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Book> books;

    @JsonCreator
    public Student(@JsonProperty("name") String name,
                   @JsonProperty("books") List<Book> books) {
        this.name = name;
        this.books = new ArrayList<>(books);
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    @Override
    public String toString() {
        return "Student " + name;
    }

}
