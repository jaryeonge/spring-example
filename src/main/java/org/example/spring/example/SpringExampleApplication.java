package org.example.spring.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringExampleApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringExampleApplication.class);
    }
}
