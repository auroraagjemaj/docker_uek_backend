package com.example.demo.domain.imagepost;


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

    @GetMapping("/getAll")
    public ResponseEntity<List<ImagePost>> retrieveAll(){
        return new ResponseEntity<>(imagePostService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
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
