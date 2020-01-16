package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "test")
@Component
@Data
public class Config {
    public static void main(String[] arg) {
        Integer a = 0;
        a += 1;
    }

}
