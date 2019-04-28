package by.epam.task_1.dao;

import by.epam.task_1.bean.TouristCompany;
import by.epam.task_1.bean.TouristVoucher;
import by.epam.task_1.dao.exception.DAOException;

public class Manager implements AdminDAO{

    public void addVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException {
        touristCompany.addVoucher(voucher);
    }

    public void deleteVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException {
        touristCompany.removeVoucher(voucher);
    }

    public void refactorVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException {
        touristCompany.returnVoucher(voucher);
        //need think about this one
    }
}
