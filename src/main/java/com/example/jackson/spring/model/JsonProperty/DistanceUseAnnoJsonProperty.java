package com.example.jackson.spring.model.JsonProperty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DistanceUseAnnoJsonProperty {
    @JsonProperty("distance-in-km")
    KILOMETER("km", 1000),
    @JsonProperty("distance-in-miles")
    MILE("miles", 1609.34);

    private String unit;
    private final double meters;

    private DistanceUseAnnoJsonProperty(String unit, double meters) {
        this.unit = unit;
        this.meters = meters;
    }

    public double getMeters() {
        return meters;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}