package com.example.demo.domain.imagepost;


import com.example.demo.domain.imagepost.dto.ImagePostDTO;
import com.example.demo.domain.imagepost.dto.ImagePostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/imagepost")
public class ImagePostController {

    @Autowired
    private ImagePostServiceImpl imagePostService;
    @Autowired
    private ImagePostMapper imagePostMapper;

    @GetMapping({"", "/"})
    public ResponseEntity<List<ImagePostDTO>> retrieveAll(){
        List<ImagePost> imagePosts = imagePostService.findAll();
        return new ResponseEntity<>(imagePostMapper.toDTOs(imagePosts), HttpStatus.OK);
    }

    @PostMapping({"", "/"})
    public ResponseEntity createImagePost(@RequestBody ImagePost imagePost){
        imagePostService.save(imagePost);
        return ResponseEntity.ok().body("Created post!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePublisher(@PathVariable ("id") UUID id){
        imagePostService.deleteById(id);
        return ResponseEntity.ok().body("Deleted publisher");
    }
}
