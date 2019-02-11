package me.saro.example.oauth2.root;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/")
    public String root() {
        return "HELLO, ROOT";
    }
}
