package com.roy.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> route(EchoHandler echoHandler){
        return RouterFunctions.route(RequestPredicates.GET("/echo")
                .and(RequestPredicates.all()),echoHandler::getEcho);
    }
}
