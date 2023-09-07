package com.example.demo.domain.imagepost;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/imagepost")
public class ImagePostController {

    @Autowired
    private ImagePostServiceImpl imagePostService;

    @GetMapping("/getAll")
    public ResponseEntity<List<ImagePost>> retrieveAll(){
        return new ResponseEntity<>(imagePostService.findAll(), HttpStatus.OK);
    }
}
