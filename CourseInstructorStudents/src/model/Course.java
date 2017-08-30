package model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printEnrolled(){
        for (Student s : students){
            s.printRecord();
        }
    }


}