package com.example.jackson.spring;

import com.example.jackson.spring.model.JsonProperty.CityUseAnnoJsonProperty;
import com.example.jackson.spring.model.JsonProperty.DistanceUseAnnoJsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luo Bao Ding
 * @since 12/18/2020
 */
public class JsonPropertyTest {
    @Test
    void deserUseAnnoJsonProperty() throws JsonProcessingException {
        String json = "{\"distance\": \"distance-in-km\"}";
        var result = new ObjectMapper().readValue(json, CityUseAnnoJsonProperty.class);
        System.out.println(result);
        assertEquals(DistanceUseAnnoJsonProperty.KILOMETER, result.getDistance());
    }


}
