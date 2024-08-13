package org.university;

import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Course> courses = new ArrayList<>();
    public Student(String name, int id) {
        super(name, id);
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
    }
}
