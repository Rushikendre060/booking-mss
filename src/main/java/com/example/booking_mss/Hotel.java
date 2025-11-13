package com.example.booking_mss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotel {

    @GetMapping("/Hotel")
    public String getdata() {
        return "Hotel's are at @25% discount ";
    }

}