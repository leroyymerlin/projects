package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

public class MyService {

    public String myRestClient() {

        RestClient client = RestClient.create();
        ResponseEntity<String> re = client
                .get()
                .uri("http://jsonplaceholder.typicode.com/posts")
                .retrieve()
                .toEntity(String.class);
        String body = re.getBody();
        String statusCode = re.getStatusCode().toString();
        String headers = re.getHeaders().toString();
        return headers;
    }

}
