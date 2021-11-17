package Lab4.Exceptions.ex1;

import java.security.DigestException;

public class PaymentCalculator {
    public int process(int nr){
        if(nr==0){
            //throw unchecked exception
            throw new DivByZeroException();
        }
        return 5000/nr + 300;
    }
    public int calculate(int numberOfHours){
        int result=0;
        try{
            checkedHours(numberOfHours);
        } catch(FewHoursException ex){
            System.out.println("Not enough hours exception occured. ");
            numberOfHours=31;
        }

        result=process(numberOfHours);
        return result;
    }

    private void checkedHours(int numberOfHours) throws FewHoursException {
        if(numberOfHours <30&&numberOfHours>0){
            //THROW CHECKED EXCEPTION
            throw new FewHoursException();
        }
    }
}
