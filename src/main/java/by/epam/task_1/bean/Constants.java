package by.epam.task_1.bean;

public final class Constants {
    private static final Constants INSTANCE = new Constants();
    private Constants() {}

    //Vouchers' meals
    public static byte CRUISE_MEAL_AMOUNT = 3;
    public static byte REST_MEAL_AMOUNT = 4;
    public static byte TRIP_MEAL_AMOUNT = 3;
    public static byte SHOPPING_MEAL_AMOUNT = 2;
    public static byte TREATMENT_MEAL_AMOUNT = 5;

    //Vouchers' amount of days
    public static short CRUISE_DURATION = 21;
    public static short REST_DURATION = 14;
    public static short TRIP_DURATION = 12;
    public static short SHOPPING_DURATION = 5;
    public static short TREATMENT_DURATION = 30;
}
