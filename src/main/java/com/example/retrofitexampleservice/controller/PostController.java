package com.example.retrofitexampleservice.controller;


import com.example.retrofitexampleservice.model.Post;
import com.example.retrofitexampleservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/retrofit")
public class PostController {


     @Autowired
     private PostService postService;
     @GetMapping("/posts")
   public List<Post> fetchPosts(){
       return postService.fetchPosts();

   }

    @GetMapping("/posts/{id}")
    public Post fetchPosts(@PathVariable ("id") int id ){
        return postService.fetchPostsById(id);

    }
}
