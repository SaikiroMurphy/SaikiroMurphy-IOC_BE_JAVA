package Ex4;

public class Laptop extends Device implements Connectable, Chargeable {
    public Laptop(int id, String name) {
        super(id, name);
    }

    @Override
    void turnOn() {
        System.out.println(this.name + " is turning on.");
    }

    @Override
    void turnOff() {
        System.out.println(this.name + " is turning off.");
    }

    @Override
    public void connectWifi() {
        System.out.println(this.name + " is connecting to WiFi.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(this.name + " is charging its battery.");
    }

}
