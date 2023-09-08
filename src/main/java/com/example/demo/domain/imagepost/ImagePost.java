package com.example.demo.domain.imagepost;

import com.example.demo.core.generic.AbstractEntity;
import com.example.demo.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "image_post")
public class ImagePost extends AbstractEntity {

    @Column
    private String image;

    @Column(length = 500)
    private String description;

    @Column
    private Integer likes;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;


    public ImagePost(UUID id, String image, String description, Integer likes, User author){
        super(id);
        this.image = image;
        this.description = description;
        this.likes = likes;
        this.author = author;
    }
}
