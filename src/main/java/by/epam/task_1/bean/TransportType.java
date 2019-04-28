package by.epam.task_1.bean;

public enum TransportType {
    BUS,
    TRAIN,
    JET,
    ROUTE_TAXI;

    public static TransportType getTourType(int index) {
        TransportType changer = null;

        switch(index) {
            case 1: changer = BUS; break;
            case 2: changer = TRAIN; break;
            case 3: changer = JET; break;
            case 4: changer = ROUTE_TAXI; break;
        }

        return changer;
    }
}
