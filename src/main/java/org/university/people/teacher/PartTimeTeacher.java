package org.university.people.teacher;

public class PartTimeTeacher extends Teacher{

    private final double activeHours;

    public PartTimeTeacher(String name,int id, double baseSalary,double activeHours){
        super(name,id,baseSalary);
        this.activeHours = activeHours;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() * this.activeHours;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + " Teacher " + getName() + " has " + this.activeHours + " active hours\n";
    }
}
