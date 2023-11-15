package dev.fumin.task.claim;

import dev.fumin.application.usecase.report.Report;
import dev.fumin.application.usecase.report.invoice.Invoice;
import dev.fumin.application.usecase.report.invoice.InvoiceGenerator;
import org.springframework.stereotype.Service;

@Service
public class PDFInvoiceGenerator implements InvoiceGenerator {
    @Override
    public Report generate(Invoice invoice) {
        // TODO: PDFで作成
        return null;
    }
}
