package Project.Factory;

public class BankAccountFactory {
    public static BankAccount createAccount(String type, double debit)
    {
        if("Current".equalsIgnoreCase(type) || "C".equalsIgnoreCase(type))
            return new CurrentAccount(debit);
        else if("Deposit".equalsIgnoreCase(type) || "D".equalsIgnoreCase(type))
            return new DepositAccount(debit);
        else if("Savings".equalsIgnoreCase(type) || "S".equalsIgnoreCase(type))
            return new SavingsAccount(debit);
        else
        {
            System.out.println("Invalid type");
            return null;
        }

    }
}
