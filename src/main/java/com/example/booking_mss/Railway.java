package com.example.booking_mss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Railway {

    @GetMapping("/Railway")
    public String getdata() {
        return "Railway ticket are at @7% discount by irctc ";
    }

}
