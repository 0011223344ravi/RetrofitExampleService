package com.example.retrofitexampleservice.service;

import com.example.retrofitexampleservice.model.Post;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

import java.util.List;

public interface PostApi {

    @GET("/posts")
    Call<List<Post>> fetchPosts();

    @GET("/posts/{id}")
    Call<Post> fetchPostsById(@Path("id")  int id );
}
