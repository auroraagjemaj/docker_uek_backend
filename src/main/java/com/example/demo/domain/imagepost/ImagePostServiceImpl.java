package com.example.demo.domain.imagepost;

import com.example.demo.core.generic.AbstractServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ImagePostServiceImpl extends AbstractServiceImpl<ImagePost> {

    @Autowired
    public ImagePostServiceImpl(ImagePostRepository repository) {
        super(repository);
    }

}
