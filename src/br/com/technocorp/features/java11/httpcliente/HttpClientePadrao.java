package br.com.technocorp.features.java11.httpcliente;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientePadrao {

    public static void main(String[] args) {

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)  // this is the default
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.co/api/people/1/"))
                .GET()   // this is the default
                .build();

        HttpResponse<String> response = null;

        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
           // response.parseAs
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (response != null){
            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response headers: " + response.headers());
            System.out.println("Response body: " + response.body());

        }


    }

}