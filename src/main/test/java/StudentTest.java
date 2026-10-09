import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void studentConstructorSetsFields(){
        Book book = new Book("Title", "Author", 200, 1500);
        Student student = new Student("Anna", List.of(book));

        assertEquals("Anna", student.getName());
        assertEquals(List.of(book), student.getBooks());
    }

    @Test
    public void studentShouldSupportEmptyList(){
        Student student = new Student("Anna", List.of());

        assertNotNull(student.getBooks());
        assertTrue(student.getBooks().isEmpty());
    }

    @Test
    public void booksShouldBeDefensivelyCopied(){
        List<Book> original = new ArrayList<>();
        Student s = new Student("Anna", original);
        original. add(new Book("New", "Author", 100, 2020));
        assertTrue(s.getBooks().isEmpty());
    }
}
