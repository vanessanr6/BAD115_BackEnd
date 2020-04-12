package com.bad.planilla.backend.apirest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.bad.planilla.backend.apirest.controller"})
@EntityScan("com.bad.planilla.backend.entity")
@EnableJpaRepositories("com.bad.planilla.backend.apirest.controller")
public class PlanillaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanillaApplication.class, args);
    }

}
