package com.example.retrofitexampleservice.service;

import com.example.retrofitexampleservice.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    public List<Post> fetchPosts();

    public Post fetchPostsById(int id);
}
