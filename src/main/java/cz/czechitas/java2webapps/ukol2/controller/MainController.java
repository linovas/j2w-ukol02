package cz.czechitas.java2webapps.ukol2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/")
    public ModelAndView citaty() {
        ModelAndView result = new ModelAndView("index");
        result.addObject("citat", 1);
        return result;

    }
}
