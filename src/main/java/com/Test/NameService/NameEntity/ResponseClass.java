package com.Test.NameService.NameEntity;

import org.springframework.stereotype.Service;

@Service
public class ResponseClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

