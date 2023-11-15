package dev.fumin.application.usecase.report.invoice;

public record Invoice(
        String customerName,
        long amount,
        double taxRate
) {
}
