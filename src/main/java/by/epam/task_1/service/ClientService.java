package by.epam.task_1.service;

import by.epam.task_1.service.exception.ServiceException;

public interface ClientService {
    void bookVoucher() throws ServiceException;
    void returnVoucher() throws ServiceException;
}
