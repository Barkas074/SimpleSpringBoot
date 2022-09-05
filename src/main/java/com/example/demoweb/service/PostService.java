package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            arrayList.add(new Post("post " + i, new Date()));
        }
        return arrayList;
    }
}
