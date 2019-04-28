package by.epam.task_1.dao;

import by.epam.task_1.bean.TouristCompany;
import by.epam.task_1.bean.TouristVoucher;
import by.epam.task_1.dao.exception.DAOException;

public interface AdminDAO {
    void addVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException;
    void deleteVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException;
    void refactorVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException;
}
