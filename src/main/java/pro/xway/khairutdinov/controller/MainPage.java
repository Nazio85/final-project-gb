package pro.xway.khairutdinov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainPage {

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
