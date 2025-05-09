package domain.payment;

/***
 * utilizando abstração |
 * trata-se de um contrato, uma planta, uma ordem. Só dezemos o que devera ser feito e não como
 */
public interface PaymentMethod {
    public void processPayment(double amount);
}
