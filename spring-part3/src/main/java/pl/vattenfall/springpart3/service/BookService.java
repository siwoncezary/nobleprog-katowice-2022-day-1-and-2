package pl.vattenfall.springpart3.service;

import pl.vattenfall.springpart3.entity.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    Book findById(long id);

    List<Book> findAll();

    void deleteById(long id);

    void update(Book book);
}
