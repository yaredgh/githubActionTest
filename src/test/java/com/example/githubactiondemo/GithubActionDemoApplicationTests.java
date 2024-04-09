package com.example.githubactiondemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GithubActionDemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void testApp() {
        GithubActionDemoApplication myApp = new GithubActionDemoApplication();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}
