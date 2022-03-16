package com.user.user_service.entity;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
@Data
public class User 
{
    private Long userId;
    private String name;
    private String phone;
   List<Contact> contacts=new ArrayList<>(); 

   public User(Long userId, String name, String phone)
    {
    this.userId = userId;
    this.name = name;
    this.phone = phone;
    }
public User() {
}

}
