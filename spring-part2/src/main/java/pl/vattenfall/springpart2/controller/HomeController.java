package pl.vattenfall.springpart2.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.vattenfall.springpart3.service.BookService;

@SpringBootApplication(scanBasePackages = "pl.vattenfall.springpart3")
@Controller
public class HomeController {
    private final BookService bookService;

    public HomeController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("books", bookService.findAll());
        return "book/index";
    }

}
