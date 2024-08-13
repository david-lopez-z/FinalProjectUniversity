package org.university;

import org.university.teacher.Teacher;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Course> availableClasses = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public University(String name){
        this.name = name;
    }

    public void addClass(Course course){
        this.availableClasses.add(course);
    }

    public void removeClass(Course course){
        this.availableClasses.remove(course);
    }
    

}