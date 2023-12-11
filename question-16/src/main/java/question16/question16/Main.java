package question16.question16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> studentList = new ArrayList<>();

        // Adding students
        Student studentAna = new Student("S101", "Ana", 39);
        studentAna.addCourse("Biology");
        studentAna.addCourse("Chemistry");

        Student studentBruno = new Student("S102", "Bruno", 27);
        studentBruno.addCourse("Computer Science");
        studentBruno.addCourse("Physics");

        Student studentCarlos = new Student("S103", "Carlos", 28);
        studentCarlos.addCourse("Mathematics");
        studentCarlos.addCourse("Physics");

        Student studentDaniela = new Student("S104", "Daniela", 22);
        studentDaniela.addCourse("Literature");
        studentDaniela.addCourse("History");

        // Adding all students to the list
        studentList.add(studentAna);
        studentList.add(studentBruno);
        studentList.add(studentCarlos);
        studentList.add(studentDaniela);

        // Displaying all students
        for (Student student : studentList) {
            student.displayStudentDetails();
        }

        // Finding students in a specific course
        String courseSearch = "Computer Science";
        System.out.println("Students in " + courseSearch + ":");
        for (Student student : studentList) {
            if (student.getCourses().contains(courseSearch)) {
                System.out.println(student.getName());
            }
        }

        // Updating the age of a specific student
        String studentIdForAgeUpdate = "S101";
        for (Student student : studentList) {
            if (student.getStudentID().equals(studentIdForAgeUpdate)) {
                int newAge = 19; // new age
                student.setAge(newAge);
                System.out.println("Updated age of " + student.getName() + " to " + newAge);
            }
        }

        // Calculating average age
        int totalAge = 0;
        for (Student student : studentList) {
            totalAge += student.getAge();
        }
        double averageAge = (double) totalAge / studentList.size();
        System.out.println("Average Age of Students: " + averageAge);
    }
}
