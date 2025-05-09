package infra;

import domain.payment.BoletoPayment;
import domain.payment.CardPayment;
import domain.payment.PaymentMethod;
import domain.payment.PixPayment;

/**
 * Aplicando Factory Pattern (Sepração da criação do uso)
 * Single Responsibility e Factory Patther
 */
public class PaymentFactory {

    public static PaymentMethod getPaymentMethod(String type){
        return switch (type.toLowerCase()){
            case "pix" -> new PixPayment();
            case "cartao" -> new CardPayment();
            case "boleto" -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido");
        };
    }
}
