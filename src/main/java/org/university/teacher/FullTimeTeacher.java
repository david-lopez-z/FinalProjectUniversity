package org.university.teacher;

public class FullTimeTeacher extends Teacher {
    private final double yearsOfExperience;
    private static final float SALARY_INCREMENTAL_FACTOR = 1.1f;

    public FullTimeTeacher(String name,int id, double baseSalary, double yearsOfExperience) {
        super(name,id, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public  double getSalary() {
        return getBaseSalary() * this.yearsOfExperience * this.SALARY_INCREMENTAL_FACTOR;
    }

    @Override
    public String toString() {
        return "Id: " + getId() +" Teacher " + getName() + " has " + this.yearsOfExperience + " years of experience\n";
    }
}
