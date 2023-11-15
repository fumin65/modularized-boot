package dev.fumin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "dev.fumin.api",
        "dev.fumin.application.usecase.command.todo",
        "dev.fumin.application.usecase.query.todo"
})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
