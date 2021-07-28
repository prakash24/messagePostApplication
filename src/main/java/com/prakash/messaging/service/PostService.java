package com.prakash.messaging.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.messaging.exceptions.UserNotFoundException;
import com.prakash.messaging.model.Post;
import com.prakash.messaging.model.User;
import com.prakash.messaging.repository.PostRepository;
import com.prakash.messaging.repository.UserRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public Post addPost(String message, Integer postedBy) {
		Post post = new Post();
		try {
			User userPosted = userRepository.findById(postedBy).get();
			post.setMessage(message);
			post.setPostedBy(userPosted);
			post.setLikeCount(0);
			post.setDislikeCount(0);
			post.setCreationDate(new Date());
			post.setLastUpdationDate(new Date());
			
			postRepository.savePost(post);

		} catch(NoSuchElementException ex) {
			throw new UserNotFoundException("Message Posted by invalid user.");
		}
		
		return postRepository.getPost(post);
	}
	
	public List<Post> getAllPosts() {
		return postRepository.getAllPosts();
	}

}
