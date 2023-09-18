package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.service.UrlHitService;

@RestController
@RequestMapping("/api/v1/visitor-count-app")

public class UrlHitController {
    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("/count")
    public int getHitCount() {
        urlHitService.incrementHitCount();
        return urlHitService.getHitCount();
    }
}
