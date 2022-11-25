package pl.vattenfall.springpart1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@Controller
public class ServletController {

    @RequestMapping(path = "/servlet", method = RequestMethod.GET)
    public void servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String counter = request.getParameter("counter");
        int i = Integer.parseInt(counter);
        response.getWriter().println("Licznik: " + counter);
    }

    @GetMapping("/spring")
    @ResponseBody
    public String spring(@RequestParam(name = "counter", defaultValue = "1") int counter){
        return ("Licznik: " + counter);
    }

    @GetMapping(path = {"/variable/{id}", "/variable"})
    @ResponseBody
    public String pathVariable(@PathVariable(name = "id", required = false) Integer id, HttpServletResponse response){
        if (id == null){
            response.setStatus(400);
            return "";
        }
        return "Path variable: " + id;
    }

    @PostMapping("/book")
    @ResponseBody
    public String createBook(@ModelAttribute Book book){

        return book.toString();
    }
}
