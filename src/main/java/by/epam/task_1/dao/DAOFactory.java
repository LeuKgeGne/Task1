package by.epam.task_1.dao;

public class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();
    private DAOFactory() {}

    private final ClientDAO bookVoucher = new BookVoucher();
    private final AdminDAO manager = new Manager();

    public static DAOFactory getInstance() {
        return INSTANCE;
    }

    public ClientDAO getBookVoucher() {
        return bookVoucher;
    }

    public AdminDAO getManager() {
        return manager;
    }

//    public static TouristVoucher createVoucher(TourType tourType) {
//        TouristVoucher voucher;
//
//        switch(tourType) {
//            case CRUISE: {
//                voucher = new TouristVoucher(CRUISE, BUS,
//                        Constants.CRUISE_MEAL_AMOUNT, Constants.CRUISE_DURATION);
//            } break;
//            case REST: {
//                voucher = new TouristVoucher(REST, TRAIN,
//                        Constants.REST_MEAL_AMOUNT, Constants.REST_DURATION);
//            } break;
//            case TRIP: {
//                voucher = new TouristVoucher(TRIP, JET,
//                        Constants.TRIP_MEAL_AMOUNT, Constants.TRIP_DURATION);
//            } break;
//            case SHOPPING: {
//                voucher = new TouristVoucher(SHOPPING, ROUTE_TAXI,
//                        Constants.SHOPPING_MEAL_AMOUNT, Constants.SHOPPING_DURATION);
//            } break;
//            case TREATMENT: {
//                voucher = new TouristVoucher(TREATMENT, TRAIN,
//                        Constants.TREATMENT_MEAL_AMOUNT, Constants.TREATMENT_DURATION);
//            } break;
//            default: {
//                voucher = null; //im not sure
//            }
//        }
//        return voucher;
//    }
}
