package com.example.graphqltest;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SampleQuery {
    @QueryMapping
    public String hello() {
        return "HELLO WORLD";
    }

    @QueryMapping
    public GreeterResponse greeter() {
        return GreeterResponse.builder()
                .id("1234")
                .message("HELLO")
                .build();
    }
}
