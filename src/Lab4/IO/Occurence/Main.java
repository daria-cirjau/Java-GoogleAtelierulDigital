package Lab4.IO.Occurence;


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CountWords counter=new CountWords();
        try{
            FileWriter myWriter = new FileWriter("./src/Lab4/IO/Occurence/foundOccurence.txt");
            if(myWriter!=null)
            {
                myWriter.write(counter.toString());
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    }
}
