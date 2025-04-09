package com.explore.springboot_ci_cd_demo.dto;

public class TheDto {

    public TheDto(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    private String message;
}
