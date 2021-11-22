package Lab4.IO.SecretMessage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  /*  public static void printSecretMessageToFile(String fileName){
        BufferedWriter bufferedWriter;
        try{
            FileWriter myWriter = new FileWriter();
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    }*/

    public static void main(String[] args) {
        Message message=new Message();
/*        printSecretMessageToFile("./src/Lab4/IO/foundSecretMessage.txt");*/
        try{
            FileWriter myWriter = new FileWriter("./src/Lab4/IO/SecretMessage/foundSecretMessage.txt");
            if(myWriter!=null)
            {
                myWriter.write(message.toString());
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    }
}
