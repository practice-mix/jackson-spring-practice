package com.example.jackson.spring;

import com.example.jackson.spring.model.JsonFormat.DistanceUseAnnoJsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

/**
 * @author Luo Bao Ding
 * @since 12/18/2020
 */
public class JsonFormatTest {
    @Test
    void enumAsJsonObjectUseAnnoJsonFormat() throws JsonProcessingException {
        String result = new ObjectMapper().writeValueAsString(DistanceUseAnnoJsonFormat.MILE);
        System.out.println(result);

    }
}
