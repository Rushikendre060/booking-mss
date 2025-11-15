package com.example.booking_mss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {

    @GetMapping("/Flight")
    public String getdata() {
        return "flight are free today for people with pet BY sir Ratan TATA ";
    }
     @GetMapping("/indigoflight")
    public String putdata() {
        return "indigoflight are has announced something big ";
    }

}
