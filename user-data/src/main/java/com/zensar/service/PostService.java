package com.zensar.service;

import java.util.List;

import com.zensar.dto.PostDto;
import com.zensar.entity.Post;
import com.zensar.entity.User;

public interface PostService {

	// create

	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	
	Post updatePost(PostDto postDto, Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	//get all posts

	List<Post> getAllPost();
	
	//get single post
	
	Post getPostById(Integer postId);
	
	//get allpost by category
	
	List<Post> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	
	List<User> getPostsByUser(Integer userId);
	
	//search posts
	
	List<Post> searchPosts(String keyword);
}
