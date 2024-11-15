package ru.services.curriculumvitaeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurriculumVitaeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurriculumVitaeServiceApplication.class, args);
    }

}