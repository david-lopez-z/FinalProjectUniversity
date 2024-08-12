package org.university.teacher;

public abstract class Teacher {
    private final String name;
    private final double baseSalary;

    public Teacher(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public String getName() {
        return this.name;
    }

    abstract double getSalary();
}
