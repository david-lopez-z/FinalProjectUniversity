package org.university.console;

import org.university.Course;
import org.university.Student;
import org.university.University;

import java.util.Scanner;

public class Console {

    private static final University university = DataInitializer.initializeData();

    public static void main(String[] args) {
        displayWelcomeMessage();
        displayMainMenu();
    }

    private static void displayWelcomeMessage(){
        System.out.println(" __        __   _                             _        \n" +
                " \\ \\      / /__| | ___ ___  _ __ ___   ___   | |_ ___  \n" +
                "  \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\  | __/ _ \\ \n" +
                "   \\ V  V /  __/ | (_| (_) | | | | | |  __/  | || (_) |\n" +
                "   _\\_/\\_/ \\___|_|\\___\\___/|_| |_|_|_|\\___|   \\__\\___/ \n" +
                "  / ___| | ___ | |__   __ _ _ __ | |_                  \n" +
                " | |  _| |/ _ \\| '_ \\ / _` | '_ \\| __|                 \n" +
                " | |_| | | (_) | |_) | (_| | | | | |_                  \n" +
                "  \\____|_|\\___/|_.__/ \\__,_|_| |_|\\__|                 \n" +
                " | | | |_ __ (_)_   _____ _ __ ___(_) |_ _   _         \n" +
                " | | | | '_ \\| \\ \\ / / _ \\ '__/ __| | __| | | |        \n" +
                " | |_| | | | | |\\ V /  __/ |  \\__ \\ | |_| |_| |        \n" +
                "  \\___/|_| |_|_| \\_/ \\___|_|  |___/_|\\__|\\__, |        \n" +
                "                                         |___/        ");
    }


    private static final Scanner input = new Scanner(System.in);
    private static String getStringInput() {
        return input.nextLine().trim();
    }

    private static void displayMainMenu() {
        System.out.println("\nSelect an option to continue:\n" +
                "1. Query All professors\n" +
                "2. Query classes info\n" +
                "3. Create new student and add him to a class.\n" +
                "4. Create new class with existing info \n" +
                "5. List all classes for a specific student\n"+
                "6. Exit.\n");

        String input = getStringInput();

        switch (input) {
            case "1":
                System.out.println(university.queryAllTeachers());
                break;
            case "2":
                displayQueryAllClassesMenu();
                break;
            case "3":
                createNewStudent();
                break;
            case "4":

                break;
            case "5":
                
                break;
            case "6":
                exit();
                break;
            default:
                System.out.println("Invalid input, please try again.");
                displayMainMenu();
                break;
        }

        displayMainMenu();

    }

    public static void createNewStudent(){
        System.out.println("Input student's name");
        String name = getStringInput();
        System.out.println("Which class does this student belong to (input class name as is)");
        String classname = getStringInput();
        Student student = university.addStudent(name);
        university.getClassByName(classname).addStudent(student);
        System.out.println("Student added successfully");

    }


    private static void displayQueryAllClassesMenu(){
        //System.out.println("this works");
        System.out.println(university.queryAllClasses());

        System.out.println("\nSelect an option to continue:\n" +
                "1. Get detailed class info\n" +
                "2. Back to main menu\n");

        String input = getStringInput();

        switch (input) {
            case "1":
                System.out.println("Please input the class name as is.");
                String name = getStringInput();
                System.out.println(university.queryDetailedClassByName(name));
                break;
            case "2":
                return;
            default:
                System.out.println("Invalid input, please try again.");
                displayMainMenu();
                break;
        }
    }

    private static void exit() {
        System.out.println("                                                                                 \n" +
                "         ,----.                    ,--.,--.                                      \n" +
                "        '  .-./    ,---.  ,---.  ,-|  ||  |-.,--. ,--.,---.                      \n" +
                "        |  | .---.| .-. || .-. |' .-. || .-. '\\  '  /| .-. :                     \n" +
                "        '  '--'  |' '-' '' '-' '\\ `-' || `-' | \\   ' \\   --.                     \n" +
                "         `------'  `---'  `---'  `---'  `---'.-'  /   `----'                     \n" +
                "                                             `---'                               \n" +
                " ,---.                                        ,--.          ,--.                 \n" +
                "'   .-'  ,---.  ,---.     ,--. ,--.,--,--.    |  | ,--,--.,-'  '-. ,---. ,--.--. \n" +
                "`.  `-. | .-. :| .-. :     \\  '  /' ,-.  |    |  |' ,-.  |'-.  .-'| .-. :|  .--' \n" +
                ".-'    |\\   --.\\   --.      \\   ' \\ '-'  |    |  |\\ '-'  |  |  |  \\   --.|  |    \n" +
                "`-----'  `----' `----'    .-'  /   `--`--'    `--' `--`--'  `--'   `----'`--' ");
        input.close();
        System.exit(1);
    }
}
