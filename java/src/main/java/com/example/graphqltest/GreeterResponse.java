package com.example.graphqltest;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Getter
public class GreeterResponse {
    private final String id;
    private final String message;
}
