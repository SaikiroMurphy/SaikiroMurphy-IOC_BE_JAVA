package Ex2;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = new Payment[5];

        Payment cashPayment = new CashPayment(50000);
        payments[0] = cashPayment;

        CreditCardPayment creditCardPayment = new CreditCardPayment(100000);
        payments[1] = creditCardPayment;

        Payment eWalletPayment = new EWalletPayment(75000);
        payments[2] = eWalletPayment;

        Payment anotherCashPayment = new CashPayment(30000);
        payments[3] = anotherCashPayment;

        Payment anotherEWalletPayment = new EWalletPayment(120000);
        payments[4] = anotherEWalletPayment;

        for (Payment payment : payments) {
            if (payment != null) {
                payment.pay();
                payment.printAmount();

                if (payment instanceof Refundable refundable) {
                    refundable.refund();
                }
            }
        }
    }
}
