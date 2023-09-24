package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Antonio", LocalDate.parse("2002-03-08"));
        System.out.println(person.getAge());
    }
}
