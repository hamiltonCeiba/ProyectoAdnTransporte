package com.ceiba.transporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({ "co.com.ceiba.transporte" })

/*
 * @SpringBootApplication
@ComponentScan({ "co.com.ceiba.transporte" })
@EnableJpaRepositories("co.com.ceiba.transporte.infraestructure.db.jpa")
@EntityScan("co.com.ceiba.transporte.infraestructure.entity")
 */
public class TransporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransporteApplication.class, args);
	}

//	@Bean
//	public ModelMapper modelMapper() {
//		return new ModelMapper();
//	}

}



