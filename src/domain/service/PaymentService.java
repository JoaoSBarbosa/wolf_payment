package domain.service;

import domain.payment.PaymentMethod;

/**
 * Aplicando o Open/Closed (OCP) com Strategy + Factory
 * A classe PaymentService usa a abstração, sem se importar com a implementação concreta
 */
public class PaymentService {

    private final PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void executePayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
