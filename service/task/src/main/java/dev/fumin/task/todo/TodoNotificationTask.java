package dev.fumin.task.todo;

import dev.fumin.application.usecase.notification.todo.NotifyRegistrationUsecase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task/todo/notification")
public class TodoNotificationTask {

    private final NotifyRegistrationUsecase notifyRegistrationUsecase;

    public TodoNotificationTask(NotifyRegistrationUsecase notifyRegistrationUsecase) {
        this.notifyRegistrationUsecase = notifyRegistrationUsecase;
    }

    @PostMapping("/{id}")
    public void notifyRegistrationByEmail(@PathVariable String id) {
        notifyRegistrationUsecase.handle(id);
    }

}
