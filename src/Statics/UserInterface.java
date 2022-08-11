package Statics;

import Exercise.*;

public class UserInterface {
    private static int option = 0;

    public static void showMenu() {
        System.out.println("Welcome to activity one\n" +
                "Enter the option of the exercise you want to perform\n");

        do {
            printOptions();
        } while (option != 0);
    }

    private static void printOptions() {
        for (int i = 0; i < 12; i++) {
            System.out.println("[" + (i + 1) + "] - Exercise N°" + (i + 1));
        }
        System.out.println("[0] - Exit");

        option = Features.validateIntDataNumber(option);

        options(option);
    }

    private static void options(int number) {
        switch (number) {
            case 1:
                Exercise1.receiveData();
                break;
            case 2:
                Exercise2.receiveData();
                break;
            case 3:
                Exercise3.receiveData();
                break;
            case 4:
                Exercise4.receiveData();
                break;
            case 5:
                Exercise5.receiveData();
                break;
            case 6:
                Exercise6.receiveData();
                break;
            case 7:
                Exercise7.receiveData();
                break;
            case 8:
                Exercise8.receiveData();
                break;
            case 9:
                Exercise9.receiveData();
                break;
            case 10:
                Exercise10.receiveData();
                break;
            case 11:
                Exercise11.receiveData();
                break;
            case 12:
                Exercise12.receiveData();
                break;
            case 0:
                System.out.println("Activity one finished, have a nice day");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
