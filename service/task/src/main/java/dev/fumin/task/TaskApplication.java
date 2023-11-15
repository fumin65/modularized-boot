package dev.fumin.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "dev.fumin.task",
        "dev.fumin.application.usecase.notification",
        "dev.fumin.application.usecase.command.claim",
        "dev.fumin.application.usecase.report",
})
public class TaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
}
