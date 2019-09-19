package com.verizon.customerprofile.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
@RefreshScope
public class MessageReceiver {

    @Value("${msg:hello}")
    public String message;

    @GetMapping("/getmessage")
    public String getMessage() {
        return message;
    }
}