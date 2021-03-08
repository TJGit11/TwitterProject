package com.tts.twitterproject.service;

import com.tts.twitterproject.model.Tweet;
import com.tts.twitterproject.model.TweetDisplay;
import com.tts.twitterproject.model.User;

import java.util.List;


public interface TweetService {

    List<TweetDisplay> findAll();
    List<TweetDisplay> findAllByUser(User user);
    List<TweetDisplay> findAllByUsers(List<User> users);
    List<TweetDisplay> findAllWithTag(String tag);
    List<TweetDisplay> formatTweets(List<Tweet> tweets);

    void save(Tweet tweet);
}
