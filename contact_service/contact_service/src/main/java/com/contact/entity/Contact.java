package com.contact.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact
 {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;
 }
