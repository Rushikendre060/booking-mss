package com.example.booking_mss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Monsoon {


    @GetMapping("/Monsoon")
    public String getdata() {
        return " Travel with us in Monsoon and get 25% off for next season";
    }

}
