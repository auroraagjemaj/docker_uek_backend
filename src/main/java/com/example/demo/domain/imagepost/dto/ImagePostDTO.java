package com.example.demo.domain.imagepost.dto;

import com.example.demo.core.generic.AbstractDTO;
import com.example.demo.domain.user.User;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.UUID;


@Data

public class ImagePostDTO extends AbstractDTO {

    private String image;

    private String description;

    private Integer likes;

    private User author;

}
