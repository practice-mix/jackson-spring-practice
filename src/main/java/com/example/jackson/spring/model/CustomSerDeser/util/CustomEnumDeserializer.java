package com.example.jackson.spring.model.CustomSerDeser.util;

import com.example.jackson.spring.model.CustomSerDeser.DistanceUseCustomSerDeser;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class CustomEnumDeserializer extends StdDeserializer<DistanceUseCustomSerDeser> {


    protected CustomEnumDeserializer(Class<?> vc) {
        super(vc);
    }

    protected CustomEnumDeserializer(JavaType valueType) {
        super(valueType);
    }

    protected CustomEnumDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public DistanceUseCustomSerDeser deserialize(JsonParser jsonParser, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        String unit = node.get("unit").asText();
        double meters = node.get("meters").asDouble();

        for (DistanceUseCustomSerDeser distance : DistanceUseCustomSerDeser.values()) {
           
            if (distance.getUnit().equals(unit) && Double.compare(
              distance.getMeters(), meters) == 0) {
                return distance;
            }
        }

        return null;
    }
}
