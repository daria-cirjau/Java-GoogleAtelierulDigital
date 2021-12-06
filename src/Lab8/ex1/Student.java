package Lab8.ex1;

public class Student {
    private String name;
    private int gradYear;
    private int score;

    public Student(String name, int gradeYear, int score)
    {
        this.name=name;
        this.gradYear=gradeYear;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradYear=" + gradYear +
                ", score=" + score +
                '}';
    }
}
