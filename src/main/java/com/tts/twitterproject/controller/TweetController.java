package com.tts.twitterproject.controller;

import com.tts.twitterproject.model.Tweet;
import com.tts.twitterproject.service.TweetService;
import com.tts.twitterproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TweetController {

    @Autowired
    private UserService userService;
    @Autowired
    private TweetService tweetService;

    @GetMapping(value = {"/tweets", "/"})
    public String getFeed(Model model){
        List<Tweet> tweets = tweetService.findAll();
        model.addAttribute("tweetList", tweets);
        return "feed";

    }
}
