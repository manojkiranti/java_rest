package com.java.restservices.spring.buildingblock.o1;

import com.java.restservices.spring.buildingblock.UserDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/bean")
    public UserDetail helloWorldBean() {
        UserDetail userDetail = new UserDetail("Manoj", "rai", "ktm");

        return userDetail;
    }
}

