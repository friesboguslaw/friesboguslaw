package com.pl.fries.discovery.repository;

import com.pl.fries.discovery.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscoveryRepository extends JpaRepository<Post, Long>
{
}
