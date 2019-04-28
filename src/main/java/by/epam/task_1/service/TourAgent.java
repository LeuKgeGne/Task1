package by.epam.task_1.service;

import by.epam.task_1.bean.TourType;
import by.epam.task_1.bean.TouristVoucher;
import by.epam.task_1.bean.TransportType;
import by.epam.task_1.service.exception.ServiceException;

import java.util.Scanner;

public class TourAgent implements AdminService {
    public void addNewVoucher() throws ServiceException {
        Scanner scanner = new Scanner(System.in);
        TouristVoucher voucher;
        int changer;
        TourType voucherType;
        TransportType transportType;

        byte amountOfMeals;
        short amountOfDays;


        printVoucherTypes();
        voucherType = TourType.getTourType(scanner.nextInt());
        printTransportTypes();
        transportType = TransportType.getTourType(scanner.nextInt());
        printAmountOfMeals();
        amountOfMeals = scanner.nextByte();
        printAmountOfDays();
        amountOfDays = scanner.nextShort();

        TouristVoucher touristVoucher =
                new TouristVoucher(voucherType, transportType, amountOfMeals, amountOfDays);
    }

    public void deleteVoucher() throws ServiceException {

    }

    public void refactorVoucher() throws ServiceException {

    }

    private void printVoucherTypes() {
        System.out.println("Types of Voucher:");
        System.out.println("1. Rest");
        System.out.println("2. Trip");
        System.out.println("3. Treatment");
        System.out.println("4. Shopping");
        System.out.println("5. Cruise");
    }

    private void printTransportTypes() {
        System.out.println("Types of Voucher:");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Jet");
        System.out.println("4. Route Taxi");
    }

    private void printAmountOfMeals() {
        System.out.println("Enter amount of meals:");
    }

    private void printAmountOfDays() {
        System.out.println("Enter amount of days:");
    }
}
