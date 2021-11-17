package Lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Boot boot1 = new Boot(38,"Red");
        Shoe boot2 = new Boot(41,"White");
        Boot boot3 = new Boot(38,"Red");
        Boot boot4 = new Boot(38,"Green");
        Shoe running1 = new Running(12,"White");
        Shoe running2= new Running(20,"White");

        try {
/*      Pair<Boot> pair1=new Pair<Boot>(boot1,running1);
        Pair<Boot> pair2=new Pair<Boot>(boot1,boot2);*/
            Pair<Boot> pair3 = new Pair<Boot>(boot1, boot3);
            Pair<Shoe> pair4 = new Pair<Shoe>(running1, running2);
            Pair<Boot> pair5 = new Pair<Boot>(boot1, boot4);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
