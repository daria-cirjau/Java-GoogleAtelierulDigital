package Lab7.BankTransactions;

public class BankAccount {
    private String name;
    private int debit;
    public BankAccount(String name, int debit) {
        this.name=name;
        this.debit=debit;
    }

   synchronized void withdraw(double amount) throws InsufficientFundException {
        if(amount>debit){
            throw new InsufficientFundException();
        }
        debit-=amount;
        longDatabaseCall();
    }

    synchronized void deposit(double amount){
        debit+=amount;
        longDatabaseCall();
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Bank account info: name "+ name+ " debit "+debit;
    }
}


