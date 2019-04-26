package by.epam.task_1.model;

import java.util.ArrayList;
import java.util.List;

public class TouristCompany {
    private List<TouristVoucher> vouchers;

    public TouristCompany() {
        this.vouchers = new ArrayList<TouristVoucher>();
    }

    public void addVoucher(TouristVoucher touristVoucher) {
        this.vouchers.add(touristVoucher);
    }

    public void removeVoucher(TouristVoucher touristVoucher) {
        this.vouchers.remove(touristVoucher);
    }
}
