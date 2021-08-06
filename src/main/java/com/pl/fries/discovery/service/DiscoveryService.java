package com.pl.fries.discovery.service;

import com.pl.fries.discovery.model.Post;
import com.pl.fries.discovery.repository.DiscoveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiscoveryService
{

    private final DiscoveryRepository discoveryRepository;

    public List<Post> getPosts()
    {
        return discoveryRepository.findAll();
    }

    public String hello()
    {
        return "dupa1";
    }

    public Post getSinglePost(long id)
    {
        return discoveryRepository.findById(id) .orElseThrow();
    }
}
