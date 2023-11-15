package dev.fumin.task.todo;

import dev.fumin.application.usecase.notification.todo.RegistrationNotification;
import dev.fumin.application.usecase.notification.todo.RegistrationNotifier;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmailRegistrationNotifier implements RegistrationNotifier {
    @Override
    public void notify(RegistrationNotification notification) throws IOException {
        // TODO: send email
    }
}
