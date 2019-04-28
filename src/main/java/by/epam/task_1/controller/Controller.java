package by.epam.task_1.controller;

public final class Controller {
    private static final Controller INSTANCE = new Controller();
    private Controller() {}

    public static Controller getInstance() {
        return INSTANCE;
    }

    public void chooseAsAdmin(String request) {
        System.out.println("chooseAsAdmin");
    }

    public void chooseAsClient(String request) {
        System.out.println("chooseAsClient");
    }
}
