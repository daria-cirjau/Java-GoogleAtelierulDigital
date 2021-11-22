package Lab3.Proxy;

public class Main {
    public static void main(String[] args) {

        Apartment ap1=new Apartment("Crangasi1",300);
        Apartment ap2=new Apartment("Crangasi2",390);
        Apartment ap3=new Apartment("Crangasi3",700);
        Apartment ap4=new Apartment("Crangasi4",400);
        RealEstateAgentProxy proxy=new RealEstateAgentProxy();
        proxy.represent(ap1);
        proxy.represent(ap2);
        proxy.represent(ap3);
        proxy.represent(ap4);
        Student s1=new Student("Ionescu",300);
        Student s2=new Student("Popescu",500);
        Student s3=new Student("Ion",700);
        Student s4=new Student("Mihai",400);
        Apartment apartmentForStudent1=proxy.rent(s1);
        Apartment apartmentForStudent2=proxy.rent(s2);
        Apartment apartmentForStudent3=proxy.rent(s3);
        Apartment apartmentForStudent4=proxy.rent(s4);
        System.out.println(s1.getName()+" rented "+ apartmentForStudent1);
        System.out.println(s2.getName()+" rented "+ apartmentForStudent2);
        System.out.println(s3.getName()+" rented "+ apartmentForStudent3);
        System.out.println(s4.getName()+" rented "+ apartmentForStudent4);

    }
}
