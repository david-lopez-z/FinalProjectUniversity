package org.university;

import org.university.people.Student;
import org.university.people.teacher.Teacher;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private static HashMap<String,Course> availableClasses = new HashMap<>();

    public static HashMap<String,Course> getAvailableClassesHashmap(){
        return availableClasses;
    }
    private String name;
    private String description;
    private ArrayList<Student> students = new ArrayList<>();
    private Teacher teacher;

    public Course(String name, String description, Teacher teacher){
        this.name = name;
        this.description = description;
        this.teacher = teacher;
    }

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
        return "Name: " + name + "\n Description: " + description + "\n";
    }

    public String getName(){
        return this.name;
    }

    public String getAllInfo(){
        String output = "";
        StringBuilder sb = new StringBuilder(output);
        sb.append("Class name: ").append(this.name).append("\n");
        sb.append("Class description: ").append(this.description).append("\n");
        sb.append("Teacher: ").append(teacher).append("\n");
        sb.append("List of students: \n");
        for (Student student:this.students){
            sb.append(student.toString()).append('\n');
        }

        return sb.toString();
    }
}
