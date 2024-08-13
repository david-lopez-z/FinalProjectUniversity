package org.university;

import java.util.Scanner;

public class Console {
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
                "1. Add a new recipe\n" +
                "2. Query all recipes\n" +
                "3. Swap recipes.\n" +
                "4. Recipe count. \n" +
                "5. Exit.\n");

        String input = getStringInput();    

        switch (input) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":
                exit();
                break;
            default:
                System.out.println("Invalid input, please try again.");
                displayMainMenu();
                break;
        }

        displayMainMenu();

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
