package Ex2;

public class CashPayment extends Payment {

    CashPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Thanh toán tiền mặt: " + this.amount);
    }

}
