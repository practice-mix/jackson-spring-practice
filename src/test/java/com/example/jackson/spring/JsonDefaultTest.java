package com.example.jackson.spring;

import com.example.jackson.spring.model.Default.CityDefault;
import com.example.jackson.spring.model.Default.DistanceDefault;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luo Bao Ding
 * @since 12/18/2020
 */
public class JsonDefaultTest {
    @Test
    void enumSerDefault() throws JsonProcessingException {
        String result = new ObjectMapper().writeValueAsString(DistanceDefault.MILE);
        System.out.println(result);

    }

    @Test
    void deserDefault() throws JsonProcessingException {
        String json = "{\"distance\":\"KILOMETER\"}";
        CityDefault result = new ObjectMapper().readValue(json, CityDefault.class);
        System.out.println(result);
        assertEquals(DistanceDefault.KILOMETER, result.getDistance());
    }
}
