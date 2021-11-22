package Lab4.IO.Contacts;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void storeContactToFile(String fileName, Contact contact){
        BufferedWriter bufferedWriter;
        try{
            bufferedWriter=new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(contact.toString());
            if(bufferedWriter!=null)
                bufferedWriter.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{

        }
    }
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook("./src/Lab4/IO/contacts.txt");
        System.out.println(phoneBook.toString());
        System.out.println(phoneBook.findContact("Abbey"));
        storeContactToFile("./src/Lab4/IO/foundContacts.txt", phoneBook.findContact("Abbey"));
    }
}
