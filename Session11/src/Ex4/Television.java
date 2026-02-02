package Ex4;

public class Television extends Device implements Connectable {
    
    public Television(int id, String name) {
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
}