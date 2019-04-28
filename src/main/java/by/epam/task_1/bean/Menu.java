package by.epam.task_1.bean;

import java.util.Scanner;

public final class Menu {
    private static final Menu INSTANCE = new Menu();
    private Menu() {}

    public static Menu getInstance() {
        return INSTANCE;
    }

    public void AdminMenu() {
        System.out.println("1. Add voucher");
        System.out.println("2. Delete voucher");
        System.out.println("3. Refactor voucher");
        System.out.println("0. Back");
    }

    public void ClientMenu() {
        System.out.println("1. Book voucher");
        System.out.println("2. Return voucher");
        System.out.println("0. Back");
    }

    public String MakeAChoice(byte typeOfUser) {
        String choice = null;

        switch(typeOfUser) {
            case Constants.ADMIN: {
                AdminMenu();
                choice = createAdminRequest(useScanner());
            } break;
            case Constants.CLIENT: {
                ClientMenu();
                choice = createClientRequest(useScanner());
            } break;
        }
       // scanner.close();

        return choice;
    }

    private String createAdminRequest(int choice) {
        String request = null;
        switch(choice) {
            case 1: {
                request = Constants.ADD_VOUCHER;
            } break;
            case 2: {
                request = Constants.DELETE_VOUCHER;
            } break;
            case 3: {
                request = Constants.REFACTOR_VOUCHER;
            } break;
            case 0: request = Constants.BACK_CODE;
        }

        return request;
    }

    private String createClientRequest(int choice) {
        String request = null;
        switch(choice) {
            case 1: {
                request = Constants.BOOK_VOUCHER;
            } break;
            case 2: {
                request = Constants.RETURN_VOUCHER;
            } break;
            case 0: request = Constants.BACK_CODE;
        }

        return request;
    }

    private int useScanner() {
        return TheScanner.getInstance().getScanner().nextInt();
    }
}
