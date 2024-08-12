package org.university.teacher;

public class FullTimeTeacher extends Teacher {
    private final double yearsOfExperience;

    public FullTimeTeacher(String name, double baseSalary, double yearsOfExperience) {
        super(name, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    double getSalary() {
        return getBaseSalary() * yearsOfExperience * 1.1;
    }
}
