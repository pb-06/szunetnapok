package com.example.szunetnapok;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;

public class SzunetNapokApiClient {
    public static String baseUrlStr = "https://szunetnapok.hu/api/";

    public static YearHolidays getYear(int year) throws IOException, InterruptedException {
        String apiKey = ""; // TODO
        String endpoint = baseUrlStr + "/" + apiKey + "/" + year + "/json/";

        HttpClient http = HttpClient.newBuilder().build();
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .GET()
                .build();
        HttpResponse<String> res = http.send(req, null);
        System.out.println(res.statusCode());
        System.out.println(res.body());

        return null;
    }

    public static YearHolidays getYear() throws IOException, InterruptedException {
        return SzunetNapokApiClient.getYear(LocalDate.now().getYear());
    }
}
