package domain.payment;

public class BoletoPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.printf("Boleto gerado no valor de R$ %.2f\n", amount);
    }
}
