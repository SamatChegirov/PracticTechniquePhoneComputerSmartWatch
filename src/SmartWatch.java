public class SmartWatch extends Technique {
    private double battery;


    public SmartWatch(String name, String brand, String version, double battery) {
        super(name, brand, version);
        this.battery = battery;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    @Override
    public String turnOn() {
        return "SmartWatch On";
    }

    @Override
    public String turnOf() {
        return "SmartWatch Off";
    }


    @Override
    public String toString() {
        return "SmartWatch: " + getName() + " " + getBrand() + " " + getVersion() + " " + "battery " + battery + "%";
    }
}
