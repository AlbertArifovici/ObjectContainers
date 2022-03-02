package ObjectContainers;

import java.util.Comparator;

public class ageComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age.compareTo(o2.age);
    }
}