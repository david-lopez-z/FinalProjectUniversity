package org.university.teacher;

public abstract class Teacher {
    private final String name;
    private final double baseSalary;

    public Teacher(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    protected double getBaseSalary() {
        return this.baseSalary;
    }

    protected String getName() {
        return name;
    }

    abstract double getSalary();
}
