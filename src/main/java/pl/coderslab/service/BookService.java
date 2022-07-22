package pl.coderslab.service;

import pl.coderslab.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    Book getBookById(String id);

    List<Book> addBook(Book book);

    List<Book> updateBook(String id, Book book);

    List<Book> deleteBook(String id);


}
