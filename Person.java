import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private int age;

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        this.age = calculateAge(dob);
    }

    public void displayName() {
        System.out.println("Person Name: " + name);
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }

    private int calculateAge(String dob) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Assuming date format is DD-MM-YYYY
        Date birthDate = sdf.parse(dob);
        Date currentDate = new Date();

        long diff = currentDate.getTime() - birthDate.getTime();
        long ageInMillis = diff / (1000L * 60 * 60 * 24 * 365); // Convert milliseconds to years

        return (int) ageInMillis;
    }

    public static void main(String[] args) throws ParseException {
        Person person = new Person("Hrishikesh", "24-07-2000");
        person.displayName();
        person.displayAge();
    }
}
