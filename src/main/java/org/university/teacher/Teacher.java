package org.university.teacher;
import org.university.Course;
import org.university.Person;

import java.util.ArrayList;

public abstract class Teacher extends Person {
    private final double baseSalary;
    ArrayList<Course> courses = new ArrayList<>();

    public Teacher(String name,int id, double baseSalary){
        super(name,id);
        this.baseSalary = baseSalary;
    }

    protected double getBaseSalary() {
        return this.baseSalary;
    }


    abstract double getSalary();
}
