package com.example.jackson.spring;

import com.example.jackson.spring.model.JsonCreator.CityUseAnnoJsonCreator;
import com.example.jackson.spring.model.JsonCreator.DistanceUseAnnoJsonCreator;
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
public class JsonCreatorTest {
    @Test
    void deserUseAnnoJsonCreator() throws JsonProcessingException {
        String json = "{\n" +
                "    \"distance\": {\n" +
                "        \"unit\":\"miles\", \n" +
                "        \"meters\":1609.34\n" +
                "    }\n" +
                "}";
        var result = new ObjectMapper().readValue(json, CityUseAnnoJsonCreator.class);
        System.out.println(result);
        assertEquals(DistanceUseAnnoJsonCreator.MILE, result.getDistance());
    }

}
