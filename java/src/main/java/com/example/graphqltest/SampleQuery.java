package com.example.graphqltest;

import com.example.graphqltest.graphql.GreeterResponse;
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
                .withId("1234")
                .withMessage("HELLO")
                .build();
    }
}
