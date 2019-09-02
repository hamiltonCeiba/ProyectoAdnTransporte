package com.ceiba.transporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"co.com.ceiba.transporte"})
@EnableJpaRepositories("co.com.ceiba.transporte.infraestructure.db.jpa")
@EntityScan("co.com.ceiba.transporte.infraestructure.entity")
public class TransporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransporteApplication.class, args);
	}

}
