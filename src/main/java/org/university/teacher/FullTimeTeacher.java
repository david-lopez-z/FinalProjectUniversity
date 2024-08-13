package org.university.teacher;

public class FullTimeTeacher extends Teacher {
    private final double yearsOfExperience;

    public FullTimeTeacher(String name, double baseSalary, double yearsOfExperience) {
        super(name, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public  double getSalary() {
        return getBaseSalary() * this.yearsOfExperience * 1.1;
    }

    @Override
    public String toString() {
        return "Teacher: " + getName() + " has " + this.yearsOfExperience + " years of experience";
    }
}
