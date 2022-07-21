package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.Category;
import com.zensar.entity.Post;
import com.zensar.entity.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
