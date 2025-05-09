package domain.payment;

public class CardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.printf("Pagamento de R$ %.2f com Cartão de Crédito aprovado\n", amount);
    }
}
