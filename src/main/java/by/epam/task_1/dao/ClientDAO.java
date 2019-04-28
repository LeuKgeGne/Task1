package by.epam.task_1.dao;

import by.epam.task_1.bean.TouristCompany;
import by.epam.task_1.bean.TouristVoucher;
import by.epam.task_1.dao.exception.DAOException;

public interface ClientDAO {
    void bookVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException;
    void returnVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException;
}
