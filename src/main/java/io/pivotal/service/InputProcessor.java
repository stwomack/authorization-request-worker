package io.pivotal.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.aspectj.lang.annotation.Before;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class InputProcessor {
    public static final String URL = "http://localhost:8080/authorizationRequest";


    // Add toggle for endpoint URL - local vs pcf

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Object processMessage(@Payload Object message) throws UnirestException {
        Unirest.post(URL)
                .header("Content-Type", "application/json")
                .body(message)
                .asJson();
        return message;
    }
}