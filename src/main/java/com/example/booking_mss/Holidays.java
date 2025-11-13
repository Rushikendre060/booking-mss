package com.example.booking_mss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holidays {

    @GetMapping("/Holidays")
    public String getdata() {
        return "Happy Holidays  ";
    }

}
