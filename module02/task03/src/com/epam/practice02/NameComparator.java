package com.epam.practice02;

import java.util.Comparator;

/**
 * Created by vrama on 14.03.2016.
 */
public class NameComparator implements Comparator<StationaryObject> {

    @Override
    public int compare(StationaryObject o1, StationaryObject o2) {
        String name1 = o1.getManufacturerName();
        String name2 = o2.getManufacturerName();

        return name1.compareTo(name2);

    }
}
