package com.gab.dev.FirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	// Instanciando automaticamente da classe AppConfiguration
	private AppConfiguration appConfiguration;

	// metodo construtor para instanciação
	public FirstApplication(AppConfiguration appConfiguration){
	this.appConfiguration = appConfiguration;

	}

	@GetMapping("/inicio")
	public String inicio(){

        return "Hello World Spring-boot!";
    }
	// Chamando metodo da classe AppConfiguration na rota /Configuration
	@GetMapping("/Configuracao")
		public String config(){
			return appConfiguration.getMessage();
		}



}
