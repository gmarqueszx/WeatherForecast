package com.wheaterforecast.check;

import com.google.gson.Gson;
import com.wheaterforecast.data.WheaterData;
import com.wheaterforecast.config.Config;

import java.io.IOException;
import java.io.ObjectInputFilter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckWheater {
    public WheaterData checkWheater(String name) {

        Config instance = Config.getInstance();
        String apiKey = instance.getProperty("apiKey");
        URI address = URI.create("https://api.openweathermap.org/data/2.5/weather?q=" + name + "&appid=" + apiKey + "&units=metric");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | RuntimeException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return new Gson().fromJson(response.body(), WheaterData.class);


    }
}
