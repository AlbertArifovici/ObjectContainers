package ObjectContainers;

import java.util.Objects;

public class Person {

    final String name;
    final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person persoana = (Person) o;
        return Objects.equals(name, persoana.name) && Objects.equals(age, persoana.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + Objects.hash(age);
    }
}
