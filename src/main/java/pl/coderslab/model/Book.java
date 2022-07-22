package pl.coderslab.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Book {

    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

}
