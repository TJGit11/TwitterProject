package com.tts.twitterproject.service;

import com.tts.twitterproject.model.Tweet;
import com.tts.twitterproject.model.User;

import java.util.List;


public interface TweetService {

    List<Tweet> findAll();
    List<Tweet> findAllByUser(User user);
    List<Tweet> findAllByUsers(List<User> users);
    List<Tweet> findAllWithTag(String tag);
    List<Tweet> formatTweets(List<Tweet> tweets);

    void save(Tweet tweet);
}
