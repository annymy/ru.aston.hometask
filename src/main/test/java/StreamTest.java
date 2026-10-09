import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamTest {

    @Test
    public void shouldIgnoreBooksEarly2000(){
        Book book1 = new Book("Title1", "Author1", 200, 1999);
        Book book2 = new Book("Title2", "Author2", 300, 2001);

        Student student = new Student("Anna", List.of(book1, book2));

        Optional<Integer> result = Main.findYear(List.of(student));

        assertEquals(Optional.of(2001), result);
    }

    @Test
    public void shouldReturnEmptyWhenAllBooksEarly2000(){
        Book book1 = new Book("Title1", "Author1", 200, 1999);
        Book book2 = new Book("Title2", "Author2", 300, 1998);

        Student student = new Student("Anna", List.of(book1, book2));

        Optional<Integer> result = Main.findYear(List.of(student));

        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldBeEmptyWhenEmptyStudentList(){
        Optional<Integer> result = Main.findYear(List.of());

        assertTrue(result.isEmpty());
    }
}
