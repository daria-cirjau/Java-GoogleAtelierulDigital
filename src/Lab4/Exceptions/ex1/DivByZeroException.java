package Lab4.Exceptions.ex1;
//UNCHECKED
public class DivByZeroException extends RuntimeException {
    public DivByZeroException(){
        super("Can't calculate salary for zero hours. ");
    }
}
