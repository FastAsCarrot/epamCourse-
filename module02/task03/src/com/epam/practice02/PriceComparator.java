package com.epam.practice02;

import java.util.Comparator;

/**
 * Created by vrama on 13.03.2016.
 */
public class PriceComparator implements Comparator<StationaryObject> {

    @Override
    public int compare(StationaryObject o1, StationaryObject o2) {
        double price1 = o1.getPrice();
        double price2 = o2.getPrice();

        if(price1 < price2) {
            return -1;
        } else if (price1 == price2) {
            return 0;
        } else {
            return 1;
        }
    }

}
