package pl.vattenfall.springpart1;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class Book {
    private String title;
    private int editionYear;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
}
