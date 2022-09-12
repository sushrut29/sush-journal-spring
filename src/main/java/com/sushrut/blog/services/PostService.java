package com.sushrut.blog.services;

import java.util.List;

import com.sushrut.blog.entities.Post;
import com.sushrut.blog.payloads.PostDto;
import com.sushrut.blog.payloads.PostResponse;

public interface PostService {

	PostDto createPost(PostDto Post, Integer userId, Integer categoryId);
	PostDto updatePost(PostDto Post, Integer PostId);
	PostDto getPostById(Integer PostId);
	
//	List<PostDto> getAllPosts(Integer pageNumber, Integer pageSize);
	
	PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	void deletePost(Integer PostId);
	
	//get all posts by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all post by user
	
	List<PostDto> getPostsByUser(Integer userId);
	
	//
	List<PostDto> searchPosts(String keyword);
}
