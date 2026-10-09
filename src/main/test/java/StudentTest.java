import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void studentShouldConstructor(){
        Book book = new Book("Title", "Author", 200, 1500);
        Student student = new Student("Anna", List.of(book));

        assertEquals("Anna", student.getName());
        assertEquals(List.of(book), student.getBooks());
    }

    @Test
    public void studentShoulSupportEmptyList(){
        Student student = new Student("Anna", List.of());

        assertNotNull(student.getBooks());
        assertTrue(student.getBooks().isEmpty());
    }
}
