import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookTest {
    @Test
    public void bookWithSameTitleAndAuthorShouldBeEqual(){
        Book first = new Book("Title", "Author A", 200, 2020);
        Book second = new Book("Title", "Author A", 500, 2000);

        assertEquals(first, second);
    }

    @Test
    public void bookWithDifferentTitleNotBeEqual(){
        Book first = new Book("Title A", "Author A", 200, 2020);
        Book second = new Book("Title B", "Author A", 500, 2000);

        assertNotEquals(first, second);
    }

    @Test
    public void bookWithDifferentAuthorNotBeEqual(){
        Book first = new Book("Title A", "Author A", 200, 2020);
        Book second = new Book("Title A", "Author B", 500, 2000);

        assertNotEquals(first, second);
    }

    @Test
    public void equalBookHasEqualHashCode(){
        Book first = new Book("Title", "Author A", 200, 2020);
        Book second = new Book("Title", "Author A", 500, 2000);

        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void hashSetShouldKeepOnlyBookWithSameTitleAndAuthor(){
        Set<Book> books = new HashSet<>();
        books.add(new Book("Title A", "Author A", 200, 2020));
        books.add(new Book("Title A", "Author A", 600, 2000));
        books.add(new Book("Title A", "Author B", 500, 2000));

        assertEquals(2, books.size());
    }

    @Test
    public void booksShouldBeSortedByPage(){
        Book one = new Book("Title A", "Author A", 1, 2020);
        Book two = new Book("Title B", "Author B", 2, 2020);
        Book three = new Book("Title C", "Author C", 3, 2020);

        List<Book> books = new ArrayList<>(List.of(two, one, three));
        books.sort(null);

        assertEquals(List.of(one, two, three), books);
    }
}
