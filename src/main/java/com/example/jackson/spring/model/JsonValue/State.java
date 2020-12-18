package com.example.jackson.spring.model.JsonValue;

import com.fasterxml.jackson.annotation.JsonValue;

public enum State {
    ON,
    OFF,
    UNKNOWN;

    @JsonValue
    public int toValue() {
        return ordinal();
    }

}  