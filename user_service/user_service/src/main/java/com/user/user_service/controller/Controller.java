package com.user.user_service.controller;

import java.util.List;
import com.user.user_service.entity.User;
import com.user.user_service.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        User user = this.userService.getUser(userId);
        List contacts = restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/" + user.getUserId(),
                List.class);
        user.setContacts(contacts);
        return user;
    }
}
