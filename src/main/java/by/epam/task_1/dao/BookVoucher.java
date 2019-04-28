package by.epam.task_1.dao;

import by.epam.task_1.bean.TouristCompany;
import by.epam.task_1.bean.TouristVoucher;
import by.epam.task_1.dao.exception.DAOException;

public class BookVoucher implements ClientDAO {

    public void bookVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException {
        touristCompany.removeVoucher(voucher);
    }

    public void returnVoucher(TouristCompany touristCompany, TouristVoucher voucher) throws DAOException {
        touristCompany.returnVoucher(voucher);
    }
}
