package Project.Factory;

public class DepositAccount implements BankAccount{

    private float timePeriod;
    private double debit;

    DepositAccount(double debit)
    {
        this.debit=debit;
    }

    @Override
    public String getType() {
        return "Deposit account";
    }

    @Override
    public String getWithdrawLimit() {
        return "one withdraw limit";
    }


    @Override
    public int getRate() {
        return 2;
    }

    @Override
    public double getDebit() {
        return debit;
    }


    public void setTimePeriod(float timePeriod){
        this.timePeriod=timePeriod;
    }

    public float getTimePeriod(){
        return timePeriod;
    }

    @Override
    public String toString()
    {
        return this.getType()+" debit is: "+this.getDebit()+" withdraw limit: "+ this.getWithdrawLimit()+" interest rate is: "+this.getRate()+" fixed time period is: : "+this.getTimePeriod()+". If deposit is closed prematurely " +
                "commissions will be charged.";
    }
}
