package company.beans;
import company.exceptions.InvalidAgeException;

public class Person{


    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age, String name) throws InvalidAgeException {
        if(age<0||age>125) throw new InvalidAgeException("zly wiek"); {
            this.age = age;
            this.name = name;
        }
    }


    }

