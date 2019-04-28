package by.epam.task_1.bean;

public final class Constants {
    private static final Constants INSTANCE = new Constants();
    private Constants() {}

    //User's type
    public static final byte ADMIN = 1;
    public static final byte CLIENT = 2;
    public static final byte CHANGE_USER = 3;
    public static final String BACK_CODE = "RETURN";

    //Vouchers' meals for Factory
    public static final byte CRUISE_MEAL_AMOUNT = 3;
    public static final byte REST_MEAL_AMOUNT = 4;
    public static final byte TRIP_MEAL_AMOUNT = 3;
    public static final byte SHOPPING_MEAL_AMOUNT = 2;
    public static final byte TREATMENT_MEAL_AMOUNT = 5;

    //Vouchers' amount of days for Factory
    public static final short CRUISE_DURATION = 21;
    public static final short REST_DURATION = 14;
    public static final short TRIP_DURATION = 12;
    public static final short SHOPPING_DURATION = 5;
    public static final short TREATMENT_DURATION = 30;

    //Admin's requests
    public static final String ADD_VOUCHER = "Add a voucher";
    public static final String DELETE_VOUCHER = "Delete the voucher";
    public static final String REFACTOR_VOUCHER = "Refactor the voucher";

    //Client's requests
    public static final String BOOK_VOUCHER = "Book the voucher";
    public static final String RETURN_VOUCHER = "Return the voucher";
}
