import java.util.ArrayList;
import java.util.List;

public class Student1 {
    private String name;
    private String program;
    private String semester;
    private String course;
    private int marks;

    public Student1(String name, String program, String semester, String course, int marks) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();

        // Adding students to the list
        students.add(new Student1("Hrishikesh", "Bachelor of Computer Applications", "Semester 3", "Devops", 85));
        students.add(new Student1("Hrishikesh", "Bachelor of Computer Applications", "Semester 4", "C#", 34));
        students.add(new Student1("Hrishikesh", "Bachelor of Computer Applications", "Semester 4", "Machine Learning", 90));
        // Retrieve and display student details
        System.out.println("Student Details:");
        for (Student1 student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Semester: " + student.getSemester());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Marks: " + student.getMarks());
            System.out.println();
        }

        // Retrieve and display students with marks less than 40
        System.out.println("Students with Marks Less Than 40:");
        for (Student1 student : students) {
            if (student.getMarks() < 40) {
                System.out.println("Name: " + student.getName());
                System.out.println("Course: " + student.getCourse());
                System.out.println("Marks: " + student.getMarks());
                System.out.println();
            }
        }
    }
}
