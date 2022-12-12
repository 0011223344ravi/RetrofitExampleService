package com.example.retrofitexampleservice.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Post {

    private int userId;
    private int id ;
    private String title;
    private String body ;
}
