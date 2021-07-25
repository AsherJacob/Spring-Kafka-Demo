package com.practice.customdemo.controller;

import com.practice.customdemo.service.Consumer;
import com.practice.customdemo.service.FileService;
import com.practice.customdemo.service.Publisher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final FileService fileService;
    private final Publisher publisher;

    @GetMapping("/response")
    public String getResponse(){
        return fileService.getResponse();
    }

    @GetMapping("/file")
    public String getFile(){
        return fileService.getFile();
    }

//    @PostMapping("/publish")
//    public void publish(){
//        publisher.publishToTopic("1st msg");
//    }
}
