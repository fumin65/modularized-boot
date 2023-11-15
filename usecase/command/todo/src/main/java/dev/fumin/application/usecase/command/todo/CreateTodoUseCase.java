package dev.fumin.application.usecase.command.todo;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateTodoUseCase {

    public record Input(String title, String body) {
    }

    public record Output(String id) {
    }

    public Output handle(Input input) {
        System.out.println(input.title);
        System.out.println(input.body);
        return new Output(UUID.randomUUID().toString());
    }

}
