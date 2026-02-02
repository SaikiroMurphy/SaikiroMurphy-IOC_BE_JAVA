package Ex4;

public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new Television(1, "Living Room TV");
        devices[1] = new SmartPhone(2, "My Smartphone");
        devices[2] = new Laptop(3, "Work Laptop");
        for (Device device : devices) {
            device.turnOn();
            if (device instanceof Connectable connectable) {
                connectable.connectWifi();
            }
            if (device instanceof Chargeable chargeable) {
                chargeable.chargeBattery();
            }
            device.turnOff();
            System.out.println();
        }
    }
}
