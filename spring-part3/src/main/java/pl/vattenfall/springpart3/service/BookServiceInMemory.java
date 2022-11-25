package pl.vattenfall.springpart3.service;

import org.springframework.stereotype.Service;
import pl.vattenfall.springpart3.entity.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceInMemory implements BookService {
    private Map<Long, Book> books = new HashMap<>();
    private long index = 0;

    public BookServiceInMemory() {
        books.put(1L, Book.builder()
                .id(1L)
                .title("Java")
                .author("Bloch")
                .build());
        books.put(2L, Book.builder()
                .id(2L)
                .title("Thymeleaf")
                .author("Bloch")
                .build());
        books.put(3L, Book.builder()
                .id(3L)
                .title("Spring")
                .author("Freeman")
                .build());
    }

    @Override
    public void save(Book book) {
        books.putIfAbsent(++index, book);
    }

    @Override
    public Book findById(long id) {
        return books.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void deleteById(long id) {
        books.remove(id);
    }

    @Override
    public void update(Book book) {
        books.replace(book.getId(), book);
    }
}
