package by.epam.task_1.bean;

import java.util.Scanner;

public final class TheScanner {
    private Scanner scanner = new Scanner(System.in);
    private static final TheScanner INSTANCE = new TheScanner();
    private TheScanner() {}

    public static TheScanner getInstance() {
        return INSTANCE;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void closeTheScanner() {
        scanner.close();
    }
}
