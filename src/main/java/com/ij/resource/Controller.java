package com.ij.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/demo")
public class Controller {

    @GetMapping
    public String getGreetings() {
        return "Greetings from Docker Demo Your container is up and running as expected";
    }

}
