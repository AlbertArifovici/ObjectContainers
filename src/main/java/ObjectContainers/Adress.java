package ObjectContainers;

public class Adress{

    private final Country address;

    public Adress(Country country) {
        this.address = country;
    }

    public String showCountry() {
        return String.valueOf(this.address);
    }
}