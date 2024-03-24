package com.example.springbootcourse.beans;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DependentBin {
    @PostConstruct
    public void init(){
        log.info("DependentBin created");
    }
}
