package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    {
        for (int i = 0; i < 3; i++) {
            posts.add(new Post((long) posts.size(), "post " + i, new Date()));
        }
    }

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
