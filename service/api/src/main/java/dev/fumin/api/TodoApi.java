package dev.fumin.api;

import dev.fumin.application.usecase.command.todo.CreateTodoUseCase;
import dev.fumin.application.usecase.query.todo.FetchTodoUseCase;
import dev.fumin.application.usecase.query.todo.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todo")
public class TodoApi {

    private final CreateTodoUseCase createTodoUseCase;
    private final FetchTodoUseCase fetchTodoUseCase;

    public TodoApi(
            CreateTodoUseCase createTodoUseCase,
            FetchTodoUseCase fetchTodoUseCase
    ) {
        this.createTodoUseCase = createTodoUseCase;
        this.fetchTodoUseCase = fetchTodoUseCase;
    }

    @GetMapping("/{id}")
    public Todo fetchTodo(@PathVariable String id) {
        return fetchTodoUseCase.handle(id);
    }

    @PostMapping()
    public String createTodo() {
        CreateTodoUseCase.Input input = new CreateTodoUseCase.Input("title", "body");
        CreateTodoUseCase.Output output = createTodoUseCase.handle(input);
        return output.id();
    }

}
