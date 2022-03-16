package com.user.user_service.service;

import java.util.List;

import com.user.user_service.entity.User;
import com.user.user_service.service.UserService.UserService;

import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements UserService {
    List<User> list = List.of(
                              new User(1311L, "Akhir", "23525625"),
                              new User(1312L, "Farida", "99999"),
                               new User(1314L, "Sufi", "888")
                            );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
