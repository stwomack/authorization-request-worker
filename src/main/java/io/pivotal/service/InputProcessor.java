package io.pivotal.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class InputProcessor {
    @Value("${authRequestsServiceUrl}")
    private String URL;

    ObjectMapper mapper = new ObjectMapper();

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    @ServiceActivator(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public Object processMessage(@Payload Object message) throws UnirestException, JsonProcessingException {
        String payload = mapper.writeValueAsString(message);
        System.err.println(payload);
//        Unirest.post(URL)
//                .header("Content-Type", "application/json")
//                .body(payload)
//                .asJson();
        return message;
    }
}