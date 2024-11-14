package edu.iud.floristeriaiud.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class index {

    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
