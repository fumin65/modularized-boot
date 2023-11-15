package dev.fumin.application.usecase.notification;

public record Recipient(
        String name,
        String emailAddress,
        String phoneNumber
) {
}
