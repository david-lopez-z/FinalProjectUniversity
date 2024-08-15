package org.university.console;

import org.university.University;

public class DataInitializer {
    public static University initializeData(){
        University university = new University("Globant's java university");
        university.addPartTimeTeacher("David Lopez",1000,50);
        university.addPartTimeTeacher("David Zapata",1200,50);
        university.addPartTimeTeacher("Alejandro Lopez",1300,50);
        university.addPartTimeTeacher("Alejandro Zapata",1150,50);
        university.addFullTimeTeacher("Harutya",1520,10);
        university.addFullTimeTeacher("Sayuri",1420,15);
        university.addFullTimeTeacher("Yorushika",1000,7);
        university.addFullTimeTeacher("Hana",1100,12);

        university.addStudent("Juan");
        university.addStudent("Carlos");
        university.addStudent("Felipe");
        university.addStudent("Jaime");
        university.addStudent("Pedro");
        university.addStudent("Miguel");

        university.addClass("Java 1", "To learn java basics", university.getAllStudents(), university.getTeacherById(4));
        university.addClass("TAE basics", "To learn TAE", university.getAllStudents(), university.getTeacherById(3));
        university.addClass("QC basics", "To learn QC", university.getAllStudents(), university.getTeacherById(1));
        university.addClass("TAE 102", "To learn advanced TAE ", university.getAllStudents(), university.getTeacherById(5));

        return university;


    }
}
