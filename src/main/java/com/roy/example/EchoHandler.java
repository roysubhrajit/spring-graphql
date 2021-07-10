package com.roy.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Optional;

@Component
public class EchoHandler {
    public Mono<ServerResponse> getEcho(ServerRequest serverRequest){
//        Optional<Object> message = serverRequest.attribute("message");
        Optional<String> message = serverRequest.queryParam("message");
        String response = message.orElse("Missing");
        return ServerResponse.ok().body(BodyInserters.fromValue(new Echo(response)));
    }
}
