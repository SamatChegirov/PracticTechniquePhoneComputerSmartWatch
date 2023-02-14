public class Computer extends Technique {
    private double battery;

    public Computer(String name, String brand, String version, double battery) {
        super(name, brand, version);
        this.battery = battery;
    }


    @Override
    public String turnOn() {
        return "Notebook On";
    }

    @Override
    public String turnOf() {
        return "Notebook Off";
    }


    @Override
    public String toString() {
        return "Computer: " + getName() + " " + getBrand() + " " + getVersion() + " " + "battery " + battery + "%";
    }
}

