package by.epam.task_1.service;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final ClientService clientService = new Client();
    private final AdminService adminService = new TourAgent();

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public ClientService getClientService() {
        return clientService;
    }

    public AdminService getAdminService() {
        return adminService;
    }
}
