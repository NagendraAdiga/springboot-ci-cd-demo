package com.explore.springboot_ci_cd_demo.service;

import com.explore.springboot_ci_cd_demo.dto.TheDto;
import org.springframework.stereotype.Service;

@Service
public class TheService {

    public TheDto theServiceFunction() {
        return new TheDto("the message!!");
    }
}
