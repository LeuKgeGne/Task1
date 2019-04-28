package by.epam.task_1.view;

import by.epam.task_1.bean.Constants;
import by.epam.task_1.bean.Menu;
import by.epam.task_1.bean.TheScanner;
import by.epam.task_1.controller.Controller;

public class Application {
    private int userType;
    private boolean runFlag = true;
    private boolean chooseUser = true;
    private String menuChoice;

    private final static Application INSTANCE = new Application();
    private Application() {}

    public static Application getInstance() {
        return INSTANCE;
    }

    public void startApplication() {
        User user = User.getInstance();
        Menu menu = Menu.getInstance();
        Controller controller = Controller.getInstance();

        do {
            if(chooseUser) {
                userType = user.chooseUser();
                chooseUser = false;
            }

            switch(userType) {
                case Constants.ADMIN: {
                    menuChoice = menu.MakeAChoice(Constants.ADMIN);
                    if(!menuChoice.equals(Constants.BACK_CODE)) {
                        controller.chooseAsAdmin(menuChoice);
                    } else {
                        chooseUser = true;
                    }
                } break;
                case Constants.CLIENT: {
                    menuChoice = menu.MakeAChoice(Constants.CLIENT);
                    if(!menuChoice.equals(Constants.BACK_CODE)) {
                        controller.chooseAsClient(menuChoice);
                    } else {
                        chooseUser = true;
                    }
                } break;
                case Constants.CHANGE_USER: {
                    chooseUser = true;
                } break;
                //Just the end of the program
                default: {
                    runFlag = false;
                } break;
            }
        } while(runFlag);
    }


}
