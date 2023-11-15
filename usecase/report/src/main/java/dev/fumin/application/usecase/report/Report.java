package dev.fumin.application.usecase.report;

public record Report(
        byte[] content,
        String contentType
) {
}
