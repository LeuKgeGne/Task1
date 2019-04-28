package dao;

import by.epam.task_1.bean.TouristCompany;
import by.epam.task_1.bean.TouristVoucher;

public class Manager implements AdminDAO{
    private static final Manager INSTANCE = new Manager();
    private Manager() {}

    public void addVoucher(TouristCompany touristCompany, TouristVoucher voucher) {
        touristCompany.addVoucher(voucher);
    }

    public void deleteVoucher(TouristCompany touristCompany, TouristVoucher voucher) {
        touristCompany.removeVoucher(voucher);
    }

    public void refactorVoucher(TouristCompany touristCompany, TouristVoucher voucher) {
        //need think about this one
    }
}
