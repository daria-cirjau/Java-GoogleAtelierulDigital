package Lab8.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    static int getTopStudent(List<Student> students){
        Optional o= students.stream() // stream = succesiune de obiecte
                .filter((Student s)-> s.getGradYear()==2011)
                .map((Student s)->s.getScore())
                .max(Integer::compareTo);

        return (Integer)o.get();
    }
    public static void main(String[] args) {

        List<Student> students= Arrays.asList
                (new Student("S1",2011,10),
                new Student("S2",2011,8),
                new Student("S3",2011,9));

        System.out.println(getTopStudent(students));

    }
}
