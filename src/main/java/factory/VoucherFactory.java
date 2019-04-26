package factory;

import by.epam.task_1.model.Constants;
import by.epam.task_1.model.TourType;
import by.epam.task_1.model.TouristVoucher;

import static by.epam.task_1.model.TourType.*;
import static by.epam.task_1.model.TransportType.*;

public class VoucherFactory {
    private static final VoucherFactory INSTANCE = new VoucherFactory();
    private VoucherFactory() {}

    public static TouristVoucher createVoucher(TourType tourType) {
        TouristVoucher voucher;

        switch(tourType) {
            case CRUISE: {
                voucher = new TouristVoucher(CRUISE, BUS,
                        Constants.CRUISE_MEAL_AMOUNT, Constants.CRUISE_DURATION);
            } break;
            case REST: {
                voucher = new TouristVoucher(REST, TRAIN,
                        Constants.REST_MEAL_AMOUNT, Constants.REST_DURATION);
            } break;
            case TRIP: {
                voucher = new TouristVoucher(TRIP, JET,
                        Constants.TRIP_MEAL_AMOUNT, Constants.TRIP_DURATION);
            } break;
            case SHOPPING: {
                voucher = new TouristVoucher(SHOPPING, ROUTE_TAXI,
                        Constants.SHOPPING_MEAL_AMOUNT, Constants.SHOPPING_DURATION);
            } break;
            case TREATMENT: {
                voucher = new TouristVoucher(TREATMENT, TRAIN,
                        Constants.TREATMENT_MEAL_AMOUNT, Constants.TREATMENT_DURATION);
            } break;
            default: {
                voucher = null; //im not sure
            }
        }
        return voucher;
    }
}
