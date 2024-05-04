import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import static company.utils.MathUtils.add;

public class Main {

    public static void main(String[] args) {




        final int B=10;
        Person people[]=new Person[5];




        try {
            people[0] = new Person(44, "John Doo");
            people[1] = new Person(48, "Jony WU");
            people[2] = new Person(14, "Johnnson Whu");
            people[3] = new Person(124, "Spejson Kowalski");
            people[4] = new Person(69, "Wojtas jakis");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


        EmailMessenger emailMessenger = new EmailMessenger();
        for (int i = 0; i < people.length; i++) {

            emailMessenger.sendMessage(+add(B,people[i].getAge())+" Wiek");
        }



    }
    }
