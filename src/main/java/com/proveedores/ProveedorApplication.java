package com.proveedores;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Configuration
@ComponentScan("com.proveedores") 
@EnableAutoConfiguration
public class ProveedorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProveedorApplication.class, args);
    }
}