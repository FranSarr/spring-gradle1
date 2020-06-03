package com.ejercicio1.hellogradle;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    @CrossOrigin(origins = "*")
    @RequestMapping("/")
    public String index(@RequestParam(name = "name", defaultValue = "WORLD") String name){
        return "HOLA " + name;
    }
}
