package swf.army.mil;
import java.util.List;

public interface BookRepository {
    List<Book> getAllBooksByAuthor(String authorName);

    class Book {
        private String author;
        private String Title;

        public Book(String author, String title) {
            this.author = author;
            Title = title;
        }
    }
}
