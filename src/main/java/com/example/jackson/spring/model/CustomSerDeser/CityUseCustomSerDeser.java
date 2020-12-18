package com.example.jackson.spring.model.CustomSerDeser;

import com.example.jackson.spring.model.JsonCreator.DistanceUseAnnoJsonCreator;
import lombok.Data;

@Data
public class CityUseCustomSerDeser {
    
    private DistanceUseCustomSerDeser distance;

}