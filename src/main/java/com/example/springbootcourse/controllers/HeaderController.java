package com.example.springbootcourse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/my/v1")
public class HeaderController {

    @GetMapping("/headers")
    public String getAllRequestHeaders(@RequestHeader Map<String, String> headers) {
        StringBuilder content = new StringBuilder();
        for (var header : headers.entrySet()) {
            content.append(header.getKey()).append(": ").append(header.getValue()).append("\n");
        }
        return content.toString();
    }
}
