package Lab7.BankTransactions;

public class Main{

public static void main(String[]args)  throws Exception{

        BankAccount b1=new BankAccount("A",1200);
        BankAccount b2=new BankAccount("B",2600);

        System.out.println("before:");
        System.out.println("From: "+b2.toString());
        System.out.println("To: "+b1.toString()+"\n");

        TransactionThread t1=new TransactionThread("Transaction nb 1",b2,b1,10);
        TransactionThread t2=new TransactionThread("Transaction nb 2",b2,b1,3000);

        t1.start();
        t2.start();

        t1.join(); //asteapta sa se incheie thread-ul t1
        t2.join();

        System.out.println("\n"+"after:");
        System.out.println("From: "+b2.toString());
        System.out.println("To: "+b1.toString());
    }
}
