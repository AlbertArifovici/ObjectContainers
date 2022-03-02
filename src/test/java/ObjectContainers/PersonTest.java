package ObjectContainers;


import org.testng.annotations.Test;
import java.util.*;

public class PersonTest {


    @Test
    public void testOrderByName() {
        Set<Person> persons = new TreeSet<Person>(new nameComparator());

        persons.add(new Person("Alex", 25));
        persons.add(new Person("Maria", 13));
        persons.add(new Person("Bogdan", 28));

        System.out.println();
        for (Person p : persons) {
            System.out.print("Name is " + p.name);
            System.out.println(" Age is " + p.age);
        }
    }

    @Test
    public void testOrderByAge() {
        Set<Person> persons = new TreeSet<Person>(new ageComparator());

        persons.add(new Person("Alex", 25));
        persons.add(new Person("Maria", 13));
        persons.add(new Person("Bogdan", 28));

        System.out.println();
        for (Person p : persons) {
            System.out.print("Name is " + p.name);
            System.out.println(" Age is " + p.age);
        }
    }

    @Test
    public void testHobbies() {

        Set<Person> personSet = new TreeSet<Person>(new nameComparator());
        Map<Person, ArrayList<Hobby>> hobbies = new HashMap<Person, ArrayList<Hobby>>();


        personSet.add(new Person("Alex", 25));
        personSet.add(new Person("Maria", 13));
        personSet.add(new Person("Bogdan", 28));

        Iterator<Person> it = personSet.iterator();

        hobbies.put(it.next(), new ArrayList<Hobby>() {
            {
                add(new Hobby("Modeling", 1));
                add(new Hobby("Car Spotting", 2));
            }
        });

        hobbies.put(it.next(), new ArrayList<Hobby>() {
            {
                add(new Hobby("Football", 4));
                add(new Hobby("Modeling", 2));
            }
        });

        hobbies.put(it.next(), new ArrayList<Hobby>() {
            {
                add(new Hobby("Aquascaping", 1));
                add(new Hobby("Football", 1));
            }
        });

        it = personSet.iterator();

        System.out.println();
        for (Person p : personSet) {
            System.out.print(p.name + " is doing ");
            if (hobbies.get(p).iterator().hasNext()) {
                System.out.print(hobbies.get(p).iterator().next().hobbyName + " in");
                hobbies.get(p).iterator().next().showAdressList();
                hobbies.get(p).iterator().next();
                System.out.println();
            }
        }
    }
}