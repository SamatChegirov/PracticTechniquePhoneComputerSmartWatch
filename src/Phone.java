public class Phone extends Technique {
    private double battery;


    public Phone(String name, String brand, String version, double battery) {
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
        return "Phone On";
    }

    @Override
    public String turnOf() {
        return "Phone Off";
    }

    @Override
    public String toString() {
        return "Phone: " + getName() + " " + getBrand() + " " + getVersion() + " " + " battery " + battery + "%";
    }
}

