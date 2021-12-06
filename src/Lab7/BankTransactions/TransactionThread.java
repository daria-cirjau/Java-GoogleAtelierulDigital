package Lab7.BankTransactions;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name=name;
        this.from=from;
        this.to=to;
        this.amount=amount;
    }

    @Override
    public void run() {
        transfer(from, to , amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        try {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println(amount+" has been transfered from "+from.getName()+" to "+to.getName());
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage()+" in "+name);
        }


    }
}

