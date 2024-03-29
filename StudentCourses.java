

public class StudentCourses {
    private String semester;
    private String[] courses;
    private int[] marks;

    public StudentCourses(String semester, String[] courses, int[] marks) {
        this.semester = semester;
        this.courses = courses;
        this.marks = marks;
    }

    public void displayCourseInfo() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i] + ", Marks: " + marks[i]);
        }
    }

    public static void main(String[] args) {
        String[] courses = {"Machine Learning","C#" ,"Devops"};
        int[] marks = {80, 65, 35};
        StudentCourses studentCourses = new StudentCourses("4th", courses, marks);
        studentCourses.displayCourseInfo();
    }
}

