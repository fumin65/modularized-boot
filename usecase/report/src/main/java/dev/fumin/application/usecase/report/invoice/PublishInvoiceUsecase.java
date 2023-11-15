package dev.fumin.application.usecase.report.invoice;

import dev.fumin.application.usecase.report.Report;
import org.springframework.stereotype.Component;

@Component
public class PublishInvoiceUsecase {

    private final InvoiceGenerator invoiceGenerator;

    public PublishInvoiceUsecase(InvoiceGenerator invoiceGenerator) {
        this.invoiceGenerator = invoiceGenerator;
    }

    public void handle(String tenantId) {
        Invoice invoice = new Invoice("", 1000, 10);
        Report report = invoiceGenerator.generate(invoice);
        // TODO: ファイルの保存
    }

}
