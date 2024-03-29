import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private int age;

    public Student(String name, String dob) throws ParseException {
        this.name = name;
        this.age = calculateAge(dob);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
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
        Student student = new Student("Hrishikesh", "24-07-2004");
        student.displayStudentInfo();
    }
}
