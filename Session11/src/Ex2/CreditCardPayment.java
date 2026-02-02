package Ex2;

public class CreditCardPayment extends Payment implements Refundable {

    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Thanh toán qua thẻ tín dụng: " + this.amount);
    }

    @Override
    public void refund() {
        System.out.println("Hoàn tiền qua thẻ tín dụng: " + this.amount);
    }

}
