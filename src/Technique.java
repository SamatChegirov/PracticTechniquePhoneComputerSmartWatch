public class Technique {
    private String name;
    private String brand;
    private String version;

    public Technique(String name, String brand, String version) {
        this.name = name;
        this.brand = brand;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String turnOn(){
        return name + "включена";
    }

    public String turnOf(){
        return name + "выключена";
    }

    @Override
    public String toString() {
        return "Technique " + "name: " + name + ", brand: " + brand + ", version: " + version;
    }
}
