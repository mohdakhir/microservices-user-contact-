package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import com.contact.entity.Contact;

import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements Contactservice {
    List<Contact> list = List.of(
            new Contact(1L, "amit@gmail.com", "Akhir", 1311L),
            new Contact(2L, "anil@gmail.com", "farida", 1311L),
            new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 1314L)
    );
    
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
    
}
