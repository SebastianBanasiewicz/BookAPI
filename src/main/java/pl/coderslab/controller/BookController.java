package pl.coderslab.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @PostMapping("/helloBook")
    public Book helloBook(@RequestBody Book book) {
        return book;
    }

    @GetMapping("")
    public List<Book> bookList() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book bookById(@PathVariable("id") String id) {
        return bookService.getBookById(id);
    }

    @PostMapping("")
    public List<Book> addBook() {

        Book book = new Book(4L, "9788324631234", "The Godfather", "Mario Puzo",
                "G. P. Putnam's Sons", "Crime novel");

        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    public List<Book> updateBook(@PathVariable("id") String id) {

        Long bookId = Long.parseLong(id);

        Book book = new Book(bookId, "9780374165277", "Gomorra", "Roberto Saviano",
                "Mondadori", "Nonfiction");

        return bookService.updateBook(id, book);

    }

    @DeleteMapping("/{id}")
    public List<Book> deleteBook(@PathVariable("id") String id) {

        return bookService.deleteBook(id);
    }

}

