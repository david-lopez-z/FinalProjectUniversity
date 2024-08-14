package org.university;

import org.university.teacher.Teacher;

import java.util.ArrayList;
import java.util.HashMap;

public class University {
    private String name;
    private ArrayList<Course> availableClasses = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private HashMap<Integer,Student> students = new HashMap();
    private static int studentCount = 0;

    public University(String name){
        this.name = name;
    }

    public void addClass(Course course){
        this.availableClasses.add(course);
    }

    public void removeClass(Course course){
        this.availableClasses.remove(course);
    }

    public String queryAllTeachers(){
        String output = "";
        StringBuilder sb = new StringBuilder(output);
        for (Teacher teacher: teachers) {
            sb.append(teacher.toString());
        }
        return sb.toString();
    }

    public String queryAllClasses(){
        String output = "";
        StringBuilder sb = new StringBuilder(output);
        for(Course course: availableClasses){
            sb.append(course.toString());
        }
        return sb.toString();
    }

    public void addStudent(String name){
        studentCount++;
        Student newStudent = new Student(name,studentCount);
        students.put(studentCount,newStudent);
    }



}