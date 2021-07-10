package com.roy.example;

import java.util.Objects;

public class Echo {
    private String message;

    public Echo(String message){
        this.message = message;
    }

    public Echo(){}

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Echo echo = (Echo) o;
        return Objects.equals(message, echo.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
