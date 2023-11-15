package dev.fumin.application.usecase.query.todo;

import org.springframework.stereotype.Component;

@Component
public class FetchTodoUseCase {

    public Todo handle(String id) {
        return new Todo("title", "body");
    }

}
