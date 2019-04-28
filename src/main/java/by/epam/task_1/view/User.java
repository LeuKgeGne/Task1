package by.epam.task_1.view;

import java.util.Scanner;

public final class User {
    private int choice;

    private static final User INSTANCE = new User();
    private User() {}

    private void setChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice is:");
        choice = scanner.nextInt();
        //scanner.close();
    }

    public static User getInstance() {
        return INSTANCE;
    }

    private void printUserMenu() {
        System.out.println("1. Manager");
        System.out.println("2. Client");
        System.out.println("0. End");
    }

    public int chooseUser() {
        printUserMenu();
        setChoice();
        return choice;
    }
}
