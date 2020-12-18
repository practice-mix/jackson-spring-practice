package com.example.jackson.spring;

import com.example.jackson.spring.model.JsonValue.CityUseAnnoJsonValue;
import com.example.jackson.spring.model.JsonValue.DistanceUseAnnoJsonValue;
import com.example.jackson.spring.model.JsonValue.Machine;
import com.example.jackson.spring.model.JsonValue.State;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luo Bao Ding
 * @since 12/18/2020
 */
public class JsonValueTest {
    @Test
    void enumDeserUseAnnoJsonValue() throws JsonProcessingException {
        String json = "{\"name\":\"Machine 1\",\"numCores\":8,\"state\":1}";
        ObjectMapper mapper = new ObjectMapper();
        Machine jsonMachine = mapper.readValue(json, Machine.class);
        System.out.println(jsonMachine);

        Machine object = new Machine("Machine 1", 8, State.OFF);
        assertEquals(object, jsonMachine);
    }

    @Test
    void enumSerUseAnnoJsonValue() throws JsonProcessingException {
        Machine m = new Machine("Machine 1", 8, State.OFF);
        ObjectMapper mapper = new ObjectMapper();
        String machineAsJsonString = mapper.writeValueAsString(m);
        System.out.println(machineAsJsonString);
    }

    @Test
    void deserUseAnnoJsonValue() throws JsonProcessingException {
        String json = "{\"distance\":\"0.0254\"}";
        var result = new ObjectMapper().readValue(json, CityUseAnnoJsonValue.class);
        System.out.println(result);
        assertEquals(DistanceUseAnnoJsonValue.INCH, result.getDistance());
    }
    @Test
    void enumAsJsonObjectUseAnnoJsonValue() throws JsonProcessingException {
        String result = new ObjectMapper().writeValueAsString(DistanceUseAnnoJsonValue.MILE);
        System.out.println(result);

    }

}
