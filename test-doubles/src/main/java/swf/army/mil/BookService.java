package swf.army.mil;

public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public int getNumberOfBooksByAuthor(String authorName) {
        return repository.getAllBooksByAuthor(authorName).size();
        
    }
}
