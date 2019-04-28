package by.epam.task_1.service;

import by.epam.task_1.service.exception.ServiceException;

public interface AdminService {
    void addNewVoucher() throws ServiceException;
    void deleteVoucher() throws ServiceException;
    void refactorVoucher() throws ServiceException;
}
