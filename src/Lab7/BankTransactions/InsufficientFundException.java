package Lab7.BankTransactions;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        super("The provided amount is bigger than the debit");
    }
}
