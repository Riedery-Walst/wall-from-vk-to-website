package ru.andreev.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreev.blog.service.VkApiService;

@RestController
public class VkApiController {

    private final VkApiService vkApiService;

    public VkApiController(VkApiService vkApiService) {
        this.vkApiService = vkApiService;
    }

    @GetMapping()
    public ResponseEntity<String> getWallData() {
        return vkApiService.getVkData();
    }
}