package co.edu.udea.www.registro.enfermero.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RegistroSpringBootApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(RegistroSpringBootApplication.class, args);
    }
}



