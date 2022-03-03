package com.pluralsight.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pluralsight.conference.model.User;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(
                        @RequestParam(value = "firstname", defaultValue = "Vard") String firstName,
                        @RequestParam(value = "lastname", defaultValue = "Sahakyan") String lastName,
                        @RequestParam(value = "age" , defaultValue = "33") int age)

            // 3 parametrn petq e miarjamank put arvi ays tarberakum urlic

//                        @RequestParam("firstname") String firstName,
//                        @RequestParam("lastname") String lastName,
//                        @RequestParam("age") int age)
    {
        User user = new User();

        user.setFirstname(firstName);
        user.setLastname(lastName);
        user.setAge(age);
        System.out.println(firstName + " " + lastName + " " + age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User firstname: " + user.getFirstname());
        return user;
    }
}
