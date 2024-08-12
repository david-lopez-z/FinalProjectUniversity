package org.university.teacher;

public class PartTimeTeacher extends Teacher{

    private final Double activeHours;

    public PartTimeTeacher(String name, double baseSalary,double activeHours){
        super(name,baseSalary);
        this.activeHours = activeHours;
    }

    @Override
    double getSalary() {
        return getBaseSalary() * this.activeHours;
    }

    @Override
    public String toString() {
        return "Teacher: " + getName() + " has " + this.activeHours + " active hours";
    }
}
