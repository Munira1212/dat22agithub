package com.example.dat22agithub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "Hello Wrld";
    }


    //Kommentar om kode
    
    //hejhej



}
