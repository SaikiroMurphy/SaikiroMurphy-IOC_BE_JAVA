package Ex2;

public class EWalletPayment extends Payment implements Refundable {

    EWalletPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Thanh toán qua ví điện tử: " + this.amount);
    }

    @Override
    public void refund() {
        System.out.println("Hoàn tiền qua ví điện tử: " + this.amount);
    }

}
