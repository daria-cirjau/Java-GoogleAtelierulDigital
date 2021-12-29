package Project.Factory;

public class CurrentAccount implements BankAccount{

    final private int minSum = 300;
    private double debit;

    CurrentAccount(double debit)
    {
        this.debit=debit;
    }

    @Override
    public String getType() {
        return "Current account";
    }

    @Override
    public String getWithdrawLimit() {
        return "no withdraw limit";
    }


    @Override
    public int getRate() {
        if(debit<minSum)
            return 4;
        else return 0;
    }

    @Override
    public double getDebit() {
        return debit;
    }

    @Override
    public String toString()
    {
        return this.getType()+" debit is: "+this.getDebit()+" withdraw limit: "+ this.getWithdrawLimit()+" interest rate is: "+this.getRate()+" as the minimum sum for 0 rate is: "+minSum;
    }

}
