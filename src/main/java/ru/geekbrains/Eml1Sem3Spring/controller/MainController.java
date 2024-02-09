package ru.geekbrains.Eml1Sem3Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String hone() {
        return "home.html";
    }

    @RequestMapping("/cats")
    public String cats() {
        return "cats.html";
    }
}
