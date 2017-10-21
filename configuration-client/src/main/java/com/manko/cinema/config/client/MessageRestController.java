package com.manko.cinema.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smanko on 10/21/2017.
 */

@RefreshScope
@RestController
public class MessageRestController {

    @Value("${message}")
    private String message;

    @GetMapping("/message")
    String getMessage() {
        return this.message;
    }
}