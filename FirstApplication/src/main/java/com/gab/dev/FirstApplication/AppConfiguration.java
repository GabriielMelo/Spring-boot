package com.gab.dev.FirstApplication;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    public String getMessage(){
        return "Texto Configuração";
    }

}
