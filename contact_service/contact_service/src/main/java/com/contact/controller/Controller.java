package com.contact.controller;

import java.util.List;

import com.contact.entity.Contact;
import com.contact.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class Controller {
    @Autowired
    private serviceImpl si;

    @GetMapping("user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        return si.getContactsOfUser(userId);
    }
}
