package com.prakash.messaging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prakash.messaging.model.Post;
import com.prakash.messaging.model.User;
import com.prakash.messaging.service.PostService;

@Controller 
@RequestMapping(path="/message") 
public class PostController {

	@Autowired
	private PostService postService;

    @PostMapping(path="/post")
    public @ResponseBody Post addNewPost(@RequestParam String message
        , @RequestParam Integer postedBy) {
    	return postService.addPost(message, postedBy); 
    }
    
    @PutMapping(path="/react")
    public @ResponseBody Post addReaction(@RequestParam Integer postId
        , @RequestParam Integer reactedBy, String reaction) {
    	return postService.addPost(message, postedBy); 
    }

}