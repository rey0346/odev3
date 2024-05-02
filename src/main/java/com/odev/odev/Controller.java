package com.odev.odev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/controller")
public class Controller {
    @GetMapping("/all")
    public String getProjeBilgileri(){
        return "Hello world - Ramazan";
    }

}
