package by.epam.task_1;

public class TouristVoucher {
    private TourType tourType;
    private TransportType transportType;
    private byte amountOfMeals;
    private short amountOfDays;

    TouristVoucher(TourType _tourType, TransportType _transportType,
                   byte _amountOfMeals, short _amountOfDays) {
    this.tourType = _tourType;
    this.transportType = _transportType;
    this.amountOfMeals = _amountOfMeals;
    this.amountOfDays = _amountOfDays;
    }
}
