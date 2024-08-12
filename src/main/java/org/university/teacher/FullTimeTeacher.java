package org.university.teacher;

public class FullTimeTeacher extends Teacher {
    private double yearsOfExperience;
    @Override
    double getSalary() {
        return getBaseSalary() * yearsOfExperience * 1.1;
    }
}
