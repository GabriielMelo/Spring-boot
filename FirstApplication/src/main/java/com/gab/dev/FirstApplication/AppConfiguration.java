package com.gab.dev.FirstApplication;

import org.springframework.context.annotation.Configuration;
// Notação que define classe como configuração
@Configuration
public class AppConfiguration {

    public String getMessage(){
        return "Texto Configuração";
    }

}
