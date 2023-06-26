package com.UrlHitApp.controller;

import com.UrlHitApp.model.Url;
import com.UrlHitApp.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlController {

    @Autowired
    UrlService urlService;
    public UrlController(UrlService urlService){
        this.urlService=urlService;
    }
    @GetMapping("count")
    public int getHitCount() {
return urlService.getCount();
    }
    @GetMapping("/username/{yourusername}/count")
    public Url getHitCount(@PathVariable String yourusername){
        Url url=urlService.getVisits(yourusername);
        return  url;
    }
}
