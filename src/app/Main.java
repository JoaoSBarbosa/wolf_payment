package app;

import domain.payment.PaymentMethod;
import domain.service.PaymentService;
import infra.PaymentFactory;

public class Main {
    public static void main(String[] args) {

        PaymentMethod methods = PaymentFactory.getPaymentMethod("pix");
        PaymentService service = new PaymentService(methods);
        service.executePayment(5000.0);

    }
}