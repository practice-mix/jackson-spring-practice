package com.example.jackson.spring.model.CustomSerDeser.util;

import com.example.jackson.spring.model.CustomSerDeser.DistanceUseCustomSerDeser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class DistanceSerializer extends StdSerializer<DistanceUseCustomSerDeser> {

    public DistanceSerializer() {
        super(DistanceUseCustomSerDeser.class);
    }

    public DistanceSerializer(Class t) {
        super(t);
    }


    @Override
    public void serialize(
            DistanceUseCustomSerDeser distance, JsonGenerator generator, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        generator.writeStartObject();
        generator.writeFieldName("name");
        generator.writeString(distance.name());
        generator.writeFieldName("unit");
        generator.writeString(distance.getUnit());
        generator.writeFieldName("meters");
        generator.writeNumber(distance.getMeters());
        generator.writeEndObject();
    }
}