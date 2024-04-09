package com.example.githubactiondemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionDemoApplication.class, args);
    }

    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(GithubActionDemoApplication.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }

}
