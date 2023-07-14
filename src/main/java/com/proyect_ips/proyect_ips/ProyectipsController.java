package com.proyect_ips.proyect_ips;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectipsController {

    // Elementos fundamentales para trabajar con controladores.

    @GetMapping("/")
    public String index() {
        return "Hola mundo Spring Boot!";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hola " + name + "!!!";
    }

    @GetMapping("/greeting")
    public String greet(@RequestParam("name") String name) {
        return "Hola " + name + "!!!!";    }
    
}
