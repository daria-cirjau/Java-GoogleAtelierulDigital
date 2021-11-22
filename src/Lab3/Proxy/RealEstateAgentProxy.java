package Lab3.Proxy;

import java.util.Arrays;

public class RealEstateAgentProxy implements Proxy {

    int i = 0;
    Apartment[] apartments = new Apartment[0];

    @Override
    public void represent(Apartment apartment) {
        apartments= Arrays.copyOf(apartments, apartments.length + 1);
        this.apartments[i++] = apartment;
    }

    @Override
    public Apartment rent(Student student) {
        Apartment rentedApartment=null;
        int maxPrice=0;
        String name = student.getName();
        if (name.charAt(0) == 'P')
            return null;
        else
            for(int j=0;j<apartments.length;j++)
                if(maxPrice<= apartments[j].getMonthlyRentCost())
                {
                    maxPrice=this.apartments[j].getMonthlyRentCost();
            if (student.getMoney() >= maxPrice) {
            rentedApartment=this.apartments[j];
            }
        }
            return rentedApartment;
    }

}