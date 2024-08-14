package org.university;

import org.university.teacher.FullTimeTeacher;
import org.university.teacher.PartTimeTeacher;
import org.university.teacher.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class University {
    private String name;
    private HashMap<String,Course> availableClasses = new HashMap<>();
    private HashMap<Integer,Teacher> teachers = new HashMap<>();
    private HashMap<Integer,Student> students = new HashMap<>();
    private int studentCount = 0;
    private int teacherCount = 0;
    private List<Integer> activeStudentIds = new ArrayList<>();
    private List<Integer> activeTeacherIds = new ArrayList<>();
    private List<String> activeClasses = new ArrayList<>();

    public University(String name){
        this.name = name;
    }

    public University(String name, HashMap<String,Course> availableClasses, HashMap<Integer,Teacher> teachers, HashMap<Integer, Student> students, int studentCount, List<Integer> activeIds) {
        this.name = name;
        this.availableClasses = availableClasses;
        this.teachers = teachers;
        this.students = students;
        this.studentCount = studentCount;
        this.activeStudentIds = activeIds;
    }

    public void addClass(Course course){
        this.availableClasses.put(course.getName(),course);
    }

    public void removeClass(Course course){
        this.availableClasses.remove(course);
    }

    public String queryAllTeachers(){
        String output = "";
        StringBuilder sb = new StringBuilder(output);
        for (int teacherId: activeTeacherIds) {
            sb.append(teachers.get(teacherId).toString());
        }
        return sb.toString();
    }

    public String queryAllClasses(){
        String output = "";
        StringBuilder sb = new StringBuilder(output);
        for(String courseName: activeClasses){
            sb.append(availableClasses.get(courseName).toString());
        }
        return sb.toString();
    }

    public  String addStudent(String name){
        studentCount++;
        Student newStudent = new Student(name,studentCount);
        activeStudentIds.add(studentCount);
        students.put(studentCount,newStudent);

        return "Student created with id: " + studentCount;
    }

    public void removeStudent(int id){
        students.remove(id);
        activeStudentIds.remove(studentCount);
    }

    public String addPartTimeTeacher(String name,int id, double baseSalary,double activeHours){
        Teacher newPartTimeTeacher = new PartTimeTeacher(name,id, baseSalary, activeHours);
        teacherCount++;
        activeTeacherIds.add(teacherCount);
        teachers.put(teacherCount,newPartTimeTeacher);
        return "Teacher has been created with id: " + id;
    }

    public String addFullTimeTeacher(String name, int id, double baseSalary, double yearsOfExperience){
        Teacher newFullTimeTeacher = new FullTimeTeacher(name,id,baseSalary, yearsOfExperience);
        teacherCount++;
        activeTeacherIds.add(teacherCount);
        teachers.put(teacherCount,newFullTimeTeacher);
        return "Teacher has been created with id: " + id;
    }

    public void removeTeacher(int id){
        
    }



}