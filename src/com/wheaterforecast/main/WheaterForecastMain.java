package com.wheaterforecast.main;

import com.wheaterforecast.check.CheckWheater;
import com.wheaterforecast.data.WheaterData;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WheaterForecastMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the city you want to obtain weather data:");
        String name = scanner.nextLine();


        CheckWheater checkWheater = new CheckWheater();
        WheaterData wheaterData = checkWheater.checkWheater(name);

        System.out.println(wheaterData.toString());
    }
}
