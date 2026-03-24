package com.corejava.di.spellchecker;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifeCycleHooks {

    @PostConstruct
    public void start(){
        System.out.println("Post construct initilizing email client");
    }

    @PreDestroy
    public void stop(){
        System.out.println("pre destory destroying email client");
    }
}
