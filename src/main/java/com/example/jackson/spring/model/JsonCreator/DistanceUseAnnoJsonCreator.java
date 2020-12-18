package com.example.jackson.spring.model.JsonCreator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DistanceUseAnnoJsonCreator {
    KILOMETER("km", 1000),
    MILE("miles", 1609.34),
    METER("meters", 1),
    INCH("inches", 0.0254),
    CENTIMETER("cm", 0.01),
    MILLIMETER("mm", 0.001);

    private String unit;
    private final double meters;

    private DistanceUseAnnoJsonCreator(String unit, double meters) {
        this.unit = unit;
        this.meters = meters;
    }
    @JsonCreator
    public static DistanceUseAnnoJsonCreator forValues(@JsonProperty("unit") String unit,
                                     @JsonProperty("meters") double meters) {
        for (DistanceUseAnnoJsonCreator distance : DistanceUseAnnoJsonCreator.values()) {
            if (
                    distance.unit.equals(unit) && Double.compare(distance.meters, meters) == 0) {
                return distance;
            }
        }

        return null;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMeters() {
        return meters;
    }
}