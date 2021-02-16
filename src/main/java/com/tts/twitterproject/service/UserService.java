package com.tts.twitterproject.service;

import com.tts.twitterproject.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    User saveNewUser(User user);
    User getLoggedInUser();
}
