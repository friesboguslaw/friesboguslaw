package com.pl.fries.discovery.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Comment
{
    @Id
    private long id;
    private String content;
    private LocalDateTime created;
}
