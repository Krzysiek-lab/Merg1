package pl.sda.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class failure {
    @GetMapping("/failure")
    public String login() {
        return "failure";
    }//???
}
