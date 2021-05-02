package pl.org.staszko.chucknorrisjokesspringudemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.org.staszko.chucknorrisjokesspringudemy.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String root(Model model) {
        model.addAttribute("joke", jokeService.drawJoke());
        return "index";
    }
}
