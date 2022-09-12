package com.sushrut.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushrut.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
