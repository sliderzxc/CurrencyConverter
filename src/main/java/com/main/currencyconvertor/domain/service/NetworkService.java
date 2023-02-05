package com.main.currencyconvertor.domain.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.currencyconvertor.data.constants.Constants;
import com.main.currencyconvertor.data.entity.CurrencyData;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class NetworkService {
    public CurrencyData convertCurrency(String fromCurrency, String toCurrency) {
        URI uri = URI.create(Constants.BASE_URL + Constants.API_KEY + "/" + "pair" + "/" + fromCurrency + "/" + toCurrency);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(uri)
            .build();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            HttpResponse<String> response = httpClient.send(
                request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)
            );
            return objectMapper.readValue(response.body(), new TypeReference<>() {});
        } catch (Exception e) {
            return CurrencyData.empty();
        }
    }
}