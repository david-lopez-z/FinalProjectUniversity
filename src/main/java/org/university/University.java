package org.university;

import org.university.teacher.FullTimeTeacher;
import org.university.teacher.PartTimeTeacher;
import org.university.teacher.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class University {
    private String name;
    private HashMap<String, Course> availableClasses = Course.getAvailableClassesHashmap();
    private HashMap<Integer, Teacher> teachers = Teacher.geTeachersHashmap();
    private HashMap<Integer, Student> students = Student.getStudentsHashmap();
    private int studentCount = 0;  // Bamboozled
    private int teacherCount = 0; //  Check the old comment to get the joke hahahaha
    private List<Integer> activeStudentIds = new ArrayList<>();
    private List<Integer> activeTeacherIds = new ArrayList<>();
    private List<String> activeClasses = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public ArrayList<Student> getAllStudents() {
        return new ArrayList<Student>(students.values());
    }

    public Teacher getTeacherById(int id) {
        return this.teachers.get(id);
    }

    public University(String name, HashMap<String, Course> availableClasses, HashMap<Integer, Teacher> teachers, HashMap<Integer, Student> students, int studentCount, List<Integer> activeIds) {
        this.name = name;
        this.availableClasses = availableClasses;
        this.teachers = teachers;
        this.students = students;
        this.studentCount = studentCount;
        this.activeStudentIds = activeIds;
    }

    public Course getClassByName(String name) {
        return availableClasses.get(name);
    }

    public void addClass(String name, String description, ArrayList<Student> students, Teacher teacher) {
        Course course = new Course(name, description, teacher);
        for (Student student : students) {
            course.addStudent(student);
        }
        this.activeClasses.add(name);
        this.availableClasses.put(name, course);
    }

    public void removeClass(Course course) {
        this.availableClasses.remove(course.getName());
    }

    public String queryAllTeachers() {
        try {
            String output = "";
            StringBuilder sb = new StringBuilder(output);
            for (int teacherId : activeTeacherIds) {
                sb.append(teachers.get(teacherId).toString());
            }
            return sb.toString();
        } catch (Exception e) {
            return "invalid input";
        }
    }

    public String queryAllStudents() {
        try {
            String output = "";
            StringBuilder sb = new StringBuilder(output);
            for (int studentId : activeStudentIds) {
                sb.append(students.get(studentId).toString());
            }
            return sb.toString();
        } catch (Exception e) {
            return "invalid input";
        }
    }

    public String queryAllClasses() {
        try {
            String output = "List of classes: \n";
            StringBuilder sb = new StringBuilder(output);
            for (String courseName : activeClasses) {
                sb.append(availableClasses.get(courseName).toString());
            }
            return sb.toString();
        } catch (Exception e) {
            return "invalid input";
        }
    }

    public String queryDetailedClassByName(String name) {
        try {
            return availableClasses.get(name).getAllInfo();
        } catch (Exception e) {
            return "invalid input";
        }
    }

    public Student addStudent(String name) {
        Student newStudent = new Student(name, studentCount);
        studentCount++;
        activeStudentIds.add(studentCount);
        students.put(studentCount, newStudent);
        return newStudent;
    }

    public void removeStudent(int id) {
        students.remove(id);
        activeStudentIds.remove(studentCount);
    }

    public String addPartTimeTeacher(String name, double baseSalary, double activeHours) {
        Teacher newPartTimeTeacher = new PartTimeTeacher(name, teacherCount, baseSalary, activeHours);
        teacherCount++;
        activeTeacherIds.add(teacherCount);
        teachers.put(teacherCount, newPartTimeTeacher);
        return "Teacher has been created with id: " + teacherCount;
    }

    public String addFullTimeTeacher(String name, double baseSalary, double yearsOfExperience) {
        Teacher newFullTimeTeacher = new FullTimeTeacher(name, teacherCount, baseSalary, yearsOfExperience);
        teacherCount++;
        activeTeacherIds.add(teacherCount);
        teachers.put(teacherCount, newFullTimeTeacher);
        return "Teacher has been created with id: " + teacherCount;
    }

    public void removeTeacherById(int id) {
        activeTeacherIds.remove(id);
    }

    public void removeStudentById(int id) {
        activeStudentIds.remove(id);
    }

    public String queryStudentClassesById(int id) {
        try {
            return students.get(id).getAllClasses();
        } catch (Exception e) {
            return "invalid input";
        }
    }

    public Student getStudentById(int studentId) {
        return students.get(studentId);
    }
}