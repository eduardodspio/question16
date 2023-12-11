package question16.question16;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private int age;
    private List<String> courses;

    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", Age: " + age + ", Courses: " + courses);
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCourses() {
        return courses;
    }
}
