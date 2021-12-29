package Project.Factory;

public class SavingsAccount implements BankAccount{

    private double debit;

    SavingsAccount(double debit) {
        this.debit=debit;
    }

    @Override
    public String getType() {
        return "Savings account";
    }

    @Override
    public String getWithdrawLimit() {
        return "no withdraw limit";
    }

    @Override
    public int getRate() {
        if(debit>4000)
            return 2;
        else return 4;
    }

    @Override
    public double getDebit() {
        return debit;
    }


    @Override
    public String toString()
    {
            return this.getType()+" debit is: "+this.getDebit()+" withdraw limit: "+ this.getWithdrawLimit()+" interest rate is: "+this.getRate();

    }
}
