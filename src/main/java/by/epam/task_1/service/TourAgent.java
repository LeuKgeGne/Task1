package by.epam.task_1.service;

import by.epam.task_1.bean.TouristVoucher;
import by.epam.task_1.service.exception.ServiceException;

import java.util.Scanner;

public class TourAgent implements AdminService {
    public void addNewVoucher() throws ServiceException {
        Scanner scanner = new Scanner(System.in);
        TouristVoucher voucher;
        int voucherType;

        printVoucherTypes();
        voucherType = scanner.nextInt();
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
}
