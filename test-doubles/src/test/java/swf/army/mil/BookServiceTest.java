package swf.army.mil;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {


    private BookRepository repository;


    @Test
    void shouldReturnTheCorrectNumberOfBooksByAuthorName() {
        repository = mock(BookRepository.class);
        BookService service = new BookService(repository);
        when(repository.getAllBooksByAuthor("Josh Farrington")).thenReturn(List.of(new BookRepository.Book("Josh Farrington","Nothing")));


        int actual = service.getNumberOfBooksByAuthor("Josh Farrington");

        assertEquals(1,actual);
        verify(repository).getAllBooksByAuthor("Josh Farrington");

    }

}