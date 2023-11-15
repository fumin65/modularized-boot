package dev.fumin.application.usecase.report.invoice;

import dev.fumin.application.usecase.report.Report;

public interface InvoiceGenerator {

    Report generate(Invoice invoice);

}
