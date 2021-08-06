package com.pl.fries.discovery.controller;

import com.pl.fries.discovery.model.Post;
import com.pl.fries.discovery.service.DiscoveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DiscoveryController {

    private final DiscoveryService discoveryService;

    @GetMapping("/test")
    public String test()
    {
        return discoveryService.hello();
    }

    @GetMapping("/posts")
    public List<Post> getPosts()
    {
        return discoveryService.getPosts();
    }

    @GetMapping("/posts{id}")
    public Post getSinglePost(@PathVariable long id)
    {
        return discoveryService.getSinglePost(id);
    }
}
