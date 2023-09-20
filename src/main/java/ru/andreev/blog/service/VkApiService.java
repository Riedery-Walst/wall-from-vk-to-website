package ru.andreev.blog.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VkApiService {
    @Value("${vk.access.token}")
    private String accessToken;

    public ResponseEntity<String> getVkData() {
        RestTemplate restTemplate = new RestTemplate();

        String wallId = "YOUR_ID";
        String count = "10";
        String apiUrl = "https://api.vk.com/method/";
        String apiMethod = "wall.get";
        String url = apiUrl + apiMethod + "?owner_id=" + wallId + "&count=" + count + "&v=5.131&access_token=" + accessToken;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return response;
    }
}
