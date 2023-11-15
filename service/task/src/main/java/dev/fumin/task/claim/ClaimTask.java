package dev.fumin.task.claim;

import dev.fumin.application.usecase.command.claim.CalculateBillingUsecase;
import dev.fumin.application.usecase.report.invoice.PublishInvoiceUsecase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task/claim")
public class ClaimTask {

    private final CalculateBillingUsecase calculateBillingUsecase;
    private final PublishInvoiceUsecase publishInvoiceUsecase;

    public ClaimTask(
            CalculateBillingUsecase calculateBillingUsecase,
            PublishInvoiceUsecase publishInvoiceUsecase
    ) {
        this.calculateBillingUsecase = calculateBillingUsecase;
        this.publishInvoiceUsecase = publishInvoiceUsecase;
    }

    @PostMapping("/calculate-billing/{tenantId}")
    public void calculateBilling(@PathVariable String tenantId) {
        calculateBillingUsecase.handle(tenantId);
    }

    @PostMapping("/publish-invoice/{tenantId}")
    public void publishInvoice(@PathVariable String tenantId) {
        publishInvoiceUsecase.handle(tenantId);
    }

}
