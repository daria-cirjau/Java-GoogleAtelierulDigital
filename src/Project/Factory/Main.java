package Project.Factory;

public class Main {
    public static void main(String[] args) {
        BankAccountFactory bankAccountFactory=new BankAccountFactory();

        BankAccount b1=bankAccountFactory.createAccount("C",300);
        BankAccount b2=bankAccountFactory.createAccount("D",2000);
        BankAccount b3=bankAccountFactory.createAccount("S",800);
        BankAccount b4=bankAccountFactory.createAccount("C",100);

        System.out.println("Bank account created successfully. Bank account info "+b1);
        System.out.println("Bank account created successfully. Bank account info "+b2);
        System.out.println("Bank account created successfully. Bank account info "+b3);
        System.out.println("Bank account created successfully. Bank account info "+b4);
    }

}
