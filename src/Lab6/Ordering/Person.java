package Lab6.Ordering;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "name: "+ name+", age: "+age+"\n";
    }

    @Override
    public int compareTo(Person p) {

        if(name.compareTo(p.name) != 0)
            return name.compareTo(p.name);
       /* if(name.compareTo(p.name) < 0)
           return -1;
    else
        if(name.compareTo(p.name)!= 0)
        return 1;*/

    return ((Integer)age).compareTo(p.age); //cast la Integer => devine un obiect Integer. p.age este int(=>autoboxing)
    }
}
