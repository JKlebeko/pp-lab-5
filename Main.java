import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import static company.utils.MathUtils.add;

public class Main {

    public static void main(String[] args) {

        //try {
         //   Person person=new Person(135,"Jaca");
        //} catch (InvalidAgeException e) {
        //    System.out.println(e.getMessage());
        //}
        EmailMessenger emailMessenger = new EmailMessenger();

        emailMessenger.sendMessage(+add(2,3)+" Wynik");


    }
    }
