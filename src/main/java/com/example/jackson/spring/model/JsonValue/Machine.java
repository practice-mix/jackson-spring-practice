package com.example.jackson.spring.model.JsonValue;

import lombok.Data;

@Data
public class Machine {
    String name;
    int numCores;
    State state;
    public Machine() {
    }

    public Machine(String name, int numCores, State state) {
        this.name = name;
        this.numCores = numCores;
        this.state = state;
    }

}