package domain.payment;

/**
 * POlimorfismo: cada classe implementa de forma diferente
 */
public class PixPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.printf("Pagamento de R$ %.2f via PIX processando", amount);
    }
}
