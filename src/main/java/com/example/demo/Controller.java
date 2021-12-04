package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Controller {

    @PostMapping
    public ResponseEntity<String> handleUpload(@RequestParam("file") MultipartFile file) {

        return ResponseEntity.ok(file.getOriginalFilename());
    }
}
