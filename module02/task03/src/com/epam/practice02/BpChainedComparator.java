package com.epam.practice02;

import java.awt.event.ComponentAdapter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by vrama on 14.03.2016.
 */
public class BpChainedComparator implements Comparator<StationaryObject> {

    private List<Comparator<StationaryObject>> listComparators;

    @SafeVarargs
    public BpChainedComparator(Comparator<StationaryObject>...comparators) {
        this.listComparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(StationaryObject o1, StationaryObject o2) {
        for (Comparator<StationaryObject> comparator: listComparators) {
            int result = comparator.compare(o1, o2);

            if (result != 0) {
                return  result;
            }
        }

        return 0;
    }
}
