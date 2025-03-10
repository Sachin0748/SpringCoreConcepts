package com.springcoreconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class controller {

    // UC_02
    private static final Logger logger = LoggerFactory.getLogger(controller.class);

    public static void main(String[] args) {
        logger.info("Starting HelloWorldApplication...");
        SpringApplication.run(controller.class, args);
        logger.info("HelloWorldApplication started successfully.");
    }
}

@RestController
@RequestMapping("/api")
class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("Received request for /api/hello");
        return "Hello, World!";
    }
}

