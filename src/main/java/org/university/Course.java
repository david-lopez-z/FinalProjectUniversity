package org.university;

import org.university.teacher.Teacher;

import java.util.ArrayList;

public class Course {
    private String name;
    private String description;
    private ArrayList<Student> students = new ArrayList<>();
    private Teacher teacher;

    public void addStudent(Student student){
        this.students.add(student);
        student.addCourse(this);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
        student.removeCourse(this);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " Descripcion: " + description + "\n";
    }
}
