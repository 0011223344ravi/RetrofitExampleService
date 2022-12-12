package com.example.retrofitexampleservice.service.impl;

import com.example.retrofitexampleservice.model.Post;
import com.example.retrofitexampleservice.service.PostApi;
import com.example.retrofitexampleservice.service.PostService;
import com.example.retrofitexampleservice.util.RetrofitUtil;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Component
public class PostServiceImpl implements PostService {
     private Retrofit retrofit ;
     private PostApi postApi;

     public PostServiceImpl(){

         retrofit = RetrofitUtil.getRetrofitInstance();
         postApi = retrofit.create(PostApi.class);
     }




    @Override
    public List<Post> fetchPosts() {
       List<Post>  postResponce  = new ArrayList<>();

        Call<List<Post>>  fetchPostCall  = postApi.fetchPosts();

        try {
           Response<List<Post>> response = fetchPostCall.execute();

            if(response .isSuccessful() && response.body()!=null){

                postResponce = response.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return postResponce;
    }

    @Override
    public Post fetchPostsById(int id) {
       Post  post  =  null;
       Call<Post>  fetchPost  = postApi.fetchPostsById(id);



        try {
            Response<Post> response = fetchPost.execute();

            if(response .isSuccessful() && response.body()!=null){

                post = response.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return post;
    }
}
