package dao;

import by.epam.task_1.bean.TouristCompany;
import by.epam.task_1.bean.TouristVoucher;

public interface AdminDAO {
    void addVoucher(TouristCompany touristCompany, TouristVoucher voucher);
    void deleteVoucher(TouristCompany touristCompany, TouristVoucher voucher);
    void refactorVoucher(TouristCompany touristCompany, TouristVoucher voucher);
}
