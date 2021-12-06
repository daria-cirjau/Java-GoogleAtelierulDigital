package Lab7.Rabbit;

public class RabbitThread extends Thread{
    private int nr;

    public RabbitThread(int nr){
        this.nr=nr;
    }

    @Override
    public void run(){
        System.out.println("Rabbit number "+nr+" is running");
    }
}
