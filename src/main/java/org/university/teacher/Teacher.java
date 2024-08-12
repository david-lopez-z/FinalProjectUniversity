package org.university.teacher;

public abstract class Teacher {
    private String name;
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    abstract double getSalary();
}
