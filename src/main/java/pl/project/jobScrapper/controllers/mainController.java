package pl.project.jobScrapper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }
}
