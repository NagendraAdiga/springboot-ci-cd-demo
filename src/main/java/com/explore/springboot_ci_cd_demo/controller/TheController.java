package com.explore.springboot_ci_cd_demo.controller;

import com.explore.springboot_ci_cd_demo.dto.TheDto;
import com.explore.springboot_ci_cd_demo.service.TheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {

    @Autowired
    private TheService theService;

    @GetMapping
    public TheDto theEndpoint(){
        return theService.theServiceFunction();
    }
}
