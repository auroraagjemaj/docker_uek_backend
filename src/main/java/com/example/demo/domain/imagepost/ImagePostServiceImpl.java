package com.example.demo.domain.imagepost;

import com.example.demo.core.generic.AbstractRepository;
import com.example.demo.core.generic.AbstractServiceImpl;
import com.example.demo.domain.user.User;
import org.springframework.stereotype.Service;

@Service
public class ImagePostServiceImpl extends AbstractServiceImpl<ImagePost> {

    public ImagePostServiceImpl(ImagePostRepository repository) {
        super(repository);
    }
}
