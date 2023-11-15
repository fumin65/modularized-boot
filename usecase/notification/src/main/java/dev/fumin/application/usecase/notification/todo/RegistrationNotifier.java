package dev.fumin.application.usecase.notification.todo;

import java.io.IOException;

public interface RegistrationNotifier {
    void notify(RegistrationNotification notification) throws IOException;
}
