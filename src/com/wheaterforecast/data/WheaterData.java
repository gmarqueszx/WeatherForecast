package com.wheaterforecast.data;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WheaterData {
    private String name;
    private Main main;

    @Override
    public String toString() {
        return "WheaterData{" +
                "name='" + name + '\'' +
                ", temp=" + main.temp +
                ", temp_min=" + main.temp_min +
                ", temp_max=" + main.temp_max +
                ", humidity=" + main.humidity +
                '}';
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Main {
        private double temp;
        private double temp_min;
        private double temp_max;
        private double humidity;
    }
}