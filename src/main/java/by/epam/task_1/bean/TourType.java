package by.epam.task_1.bean;

public enum TourType {
    REST,
    TRIP,
    TREATMENT,
    SHOPPING,
    CRUISE;

    public static TourType getTourType(int index) {
        TourType changer = null;

        switch(index) {
            case 1: changer = TRIP; break;
            case 2: changer = REST; break;
            case 3: changer = TREATMENT; break;
            case 4: changer = SHOPPING; break;
            case 5: changer = CRUISE; break;
        }

        return changer;
    }
}
