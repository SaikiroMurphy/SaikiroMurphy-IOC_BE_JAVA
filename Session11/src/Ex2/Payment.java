package Ex2;

public abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    void printAmount() {
        System.out.println("Số tiền thanh toán: " + this.amount);
    }
}
