

import java.util.Date;

public class Kata2 {
    public static void main(String[] args) {
    Person person = new Person("Aresti",new Date(92,8,17));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
