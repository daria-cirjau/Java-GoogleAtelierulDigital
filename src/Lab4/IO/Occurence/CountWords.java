package Lab4.IO.Occurence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CountWords {
    private Scanner s = null;
    private String[] storeMessage = new String[0];

    public String[] writeMessage(String inputfile) {
        try {
            String words;
            Scanner s = new Scanner(new BufferedReader(new FileReader(inputfile)));
            while (s.hasNext()) {
                storeMessage = Arrays.copyOf(storeMessage, storeMessage.length + 1);
                storeMessage[storeMessage.length-1] = s.next();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (s != null)
                s.close();
        }
    for (int j = 0; j < storeMessage.length; j++)
            System.out.println(storeMessage[j]);
        return storeMessage;
    }

    public String toString() {
        storeMessage = writeMessage("./src/Lab4/IO/Occurence/message");
        ///Vector cuvinte unice
        String[] uniqueWordsArray = new String[1];
        uniqueWordsArray[0] = storeMessage[0];
        for (int i = 0; i < storeMessage.length; i++) {
            int ok = 0;
            for (int j = 0; j < uniqueWordsArray.length; j++)
                if (storeMessage[i].equals(uniqueWordsArray[j]))
                    ok = 1;

            if (ok == 0) {
                uniqueWordsArray=Arrays.copyOf(uniqueWordsArray, uniqueWordsArray.length + 1);
                uniqueWordsArray[uniqueWordsArray.length-1] = storeMessage[i];
            }

        }
        ///Vector de frecventa
        int[] frequency = new int[uniqueWordsArray.length];
        for (int i = 0; i < storeMessage.length; i++)
            for (int j = 0; j < uniqueWordsArray.length; j++)
                if (storeMessage[i].equals(uniqueWordsArray[j]))
                    frequency[j]++;
        String toReturn="";

        for (int j = 0; j < uniqueWordsArray.length; j++)
            toReturn+= uniqueWordsArray[j] + " " + frequency[j];

        return toReturn;

    }
}
