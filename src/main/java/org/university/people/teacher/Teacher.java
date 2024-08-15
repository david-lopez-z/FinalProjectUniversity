package org.university.people.teacher;
import org.university.people.Person;

import java.util.HashMap;

public abstract class Teacher extends Person {
    private final double baseSalary;
    private static HashMap<Integer,Teacher> teachers = new HashMap<>();

    public Teacher(String name,int id, double baseSalary){
        super(name,id);
        this.baseSalary = baseSalary;
    }

    protected double getBaseSalary() {
        return this.baseSalary;
    }

    public static HashMap<Integer,Teacher> geTeachersHashmap(){
        return teachers;
    }


    abstract double getSalary();
}
