package org.university;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person{
    private static HashMap<Integer,Student> students = new HashMap<>();

    private ArrayList<Course> courses = new ArrayList<>();
    public Student(String name, int id) {
        super(name, id);
    }

    public static HashMap<Integer,Student> getStudentsHashmap(){
        return students;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
    }

    public String getAllClasses(){
        String output = "Student: " + getName() + "\n Classes: \n";
        StringBuilder sb = new StringBuilder(output);
        for(Course course: courses){
            sb.append(course.toString());
        }
        return sb.toString();
    }
}
