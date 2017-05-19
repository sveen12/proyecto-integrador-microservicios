/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.www.donaciones.sede.microservice;

import java.util.Arrays;
import co.edu.udea.www.donaciones.sede.microservice.model.Donante;
import co.edu.udea.www.donaciones.sede.microservice.repo.DonanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Lenovo
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
public class SpringBootDockerPostgresqlApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerPostgresqlApplication.class, args);
	}

	@Autowired
	private DonanteRepository repository;

	@Bean
	CommandLineRunner runner() {
		return args -> Arrays.asList(
				new Donante("1234","Calle 10","20","Soltero","Normal","Richard","Morales","O+"),
				new Donante("3245","Calle 120","98","Casado","Mala","Juan","Valdez","AB+"),
				new Donante("1234","Calle 40","43","Viudo","Regular","Ricardo","Nieto","A-")
		).forEach(repository::save);
	}
}
