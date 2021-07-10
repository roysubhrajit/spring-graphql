package com.roy.example;


import org.junit.jupiter.api.Test;


import static org.springframework.test.util.AssertionErrors.assertEquals;

public class EchoTest {

    @Test
    public void shouldBeConsideredEqualIfSameMessage(){
        assertEquals("Echo not same",new Echo("test"),new Echo("test"));
    }
}
