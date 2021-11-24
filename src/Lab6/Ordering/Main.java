package Lab6.Ordering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List person = new ArrayList<Person>();

        Person p1 = new Person("Person1", 20);
        Person p2 = new Person("Person1", 17);
        Person p3 = new Person("Person1", 17);
        Person p4 = new Person("Person2", 17);
        Person p5 = new Person("Person2", 20);

        person.addAll(Arrays.asList(p1,p2,p3,p4,p5));
        Collections.sort(person);
        System.out.println(person.toString());
        Collections.shuffle(person);
        System.out.println(person.toString());
    }
}
