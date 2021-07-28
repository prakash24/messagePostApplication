package com.prakash.messaging.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.prakash.messaging.model.Post;

@Component
public class PostRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void savePost(Post post) {
		em.persist(post);
	}
	
	public Post getPost(Post post) {
		Post savedPost = em.find(Post.class, post.getId());
		em.detach(savedPost);
		return savedPost;
	}
	
	public List<Post> getAllPosts() {
		return em.createQuery("Select p from Post p").getResultList();
	}
}
