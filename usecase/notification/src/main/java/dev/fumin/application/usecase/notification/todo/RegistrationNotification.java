package dev.fumin.application.usecase.notification.todo;

import dev.fumin.application.usecase.notification.Recipient;

public record RegistrationNotification(
        Recipient recipient,
        String todoTitle,
        String todoBody
) {
}
