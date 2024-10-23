package com.wheaterforecast.check;

import com.google.gson.Gson;
import com.wheaterforecast.data.WheaterData;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckWheater {
    public WheaterData checkWheater(String name) {

        String apikey = "03670a8b2a987a1b36019c866d425ea3";
        URI address = URI.create("https://api.openweathermap.org/data/2.5/weather?q=" + name + "&appid=" + apikey + "&units=metric");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | RuntimeException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return new Gson().fromJson(response.body(), WheaterData.class);


    }
}
