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
    private double temp;
    private double temp_min;
    private double temp_max;
    private double humidity;

    @Override
    public String toString() {
        return "WheaterData{" +
                "name='" + name + '\'' +
                ", temp=" + temp +
                ", temp_min=" + temp_min +
                ", temp_max=" + temp_max +
                ", humidity=" + humidity +
                '}';
    }
}
