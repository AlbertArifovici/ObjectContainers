package ObjectContainers;

import java.util.ArrayList;
import java.util.List;
import static ObjectContainers.Country.*;

public class Hobby {

    final String hobbyName;
    final Integer frequency;
    private List<Adress> adressList = new ArrayList<Adress>();

    public Hobby(String name, Integer freq) {
        this.hobbyName = name;
        this.frequency = freq;
        findAddressOfHobby(name);
    }

    public void showAdressList() {
        for (Adress a : adressList) {
            System.out.print(" " + a.showCountry());
        }
    }

    private void findAddressOfHobby(String name) {
        switch (name) {
            case "Aquascaping":
                adressList.add(new Adress(BULGARIA));
                break;
            case "Car Spotting":
                adressList.add(new Adress(MONACO));
                adressList.add(new Adress(ITALY));
                break;
            case "Modeling":
                adressList.add(new Adress(FRANCE));
                break;
            case "Football":
                adressList.add(new Adress(GERMANY));
                adressList.add(new Adress(ITALY));
                break;
            default:
                adressList.add(new Adress(OTHER));
        }
    }
}