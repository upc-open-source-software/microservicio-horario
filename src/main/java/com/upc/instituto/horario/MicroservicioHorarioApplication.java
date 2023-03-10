package com.upc.instituto.horario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioHorarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioHorarioApplication.class, args);
	}

}
