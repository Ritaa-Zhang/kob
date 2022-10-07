package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("p1"));
        System.out.println(passwordEncoder.encode("p2"));
        System.out.println(passwordEncoder.encode("p3"));
        System.out.println(passwordEncoder.encode("p4"));
//        System.out.println(passwordEncoder.matches("p2", "$2a$10$KTWBvIN/uQB8.A0hf/qzLulKelgrjSjrxjtyb.HDVbeZFBDVfhma6"));
    }
    @Test
    void printDate(){
        System.out.println(new Date());
    }

}
