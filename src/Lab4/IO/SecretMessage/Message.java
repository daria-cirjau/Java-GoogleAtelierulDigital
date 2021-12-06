package Lab4.IO.SecretMessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Message {

    Scanner s=null;
    String storeMessage=null;

    public String writeMessage(String inputfile){
        try{
            String word;
            Scanner s=new Scanner(new BufferedReader(new FileReader(inputfile)));
            while(s.hasNext()){
                word=s.next();
                storeMessage+=word;
            }

        }catch(IOException ex){
            System.out.println(ex);
        }finally{
            if(s!=null)
                s.close();
        }
        return storeMessage;
    }

    private String storeSecretMessage(String secretMessage){
        storeMessage=writeMessage("./src/Lab4/IO/SecretMessage/message.txt");
        for(int i=0; i<storeMessage.length();i++)
            if(Character.isUpperCase(storeMessage.charAt(i)))
            {
                if(storeMessage.charAt(i)=='X')
                    secretMessage+=" ";
                else
                secretMessage+=storeMessage.charAt(i);
            }
        return secretMessage;
    }

    public String toString(){
        String toReturn="";
            toReturn=storeSecretMessage(toReturn);
        return toReturn;
    }

}
