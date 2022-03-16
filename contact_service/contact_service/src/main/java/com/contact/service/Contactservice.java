package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;
public interface Contactservice {
    public List<Contact> getContactsOfUser(Long userId);
}
