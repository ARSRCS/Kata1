
import java.util.Date;
import java.util.logging.Logger;

public class Person {

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    private final String name;
    private final Date birthdate;
    
    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int)((new Date().getTime()-birthdate.getTime())/(365*24*60*60*1000L));
    }
    
}
