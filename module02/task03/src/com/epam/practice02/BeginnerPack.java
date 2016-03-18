package com.epam.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by vrama on 13.03.2016.
 */
public class BeginnerPack {

    public static void main(String...args) {

        ArrayList<StationaryObject> beginnerPack = new ArrayList<>();
        Pen pen = new Pen("Parker", 30.0, "Blue","Silver");
        Stapler stapler = new Stapler("Ford", 20.0, 30);
        SquareFolder sqFolder = new SquareFolder("Bjork", 12.0, "Blue", 25);
        RectFolder rectFolder = new RectFolder("Wow", 23.0, "Black", 20, 21);

        beginnerPack.add(stapler);
        beginnerPack.add(pen);
        beginnerPack.add(sqFolder);
        beginnerPack.add(rectFolder);

        for (StationaryObject bp : beginnerPack) {
            System.out.println(bp.getClass());
        }

        Collections.sort(beginnerPack, new NameComparator());
        System.out.println("\nSort by name: ");

        for (StationaryObject bp : beginnerPack) {
            System.out.println(bp.getClass() + " Name: " + bp.getManufacturerName());
        }


        Collections.sort(beginnerPack,new PriceComparator());

        System.out.println("\nSorted by price: ");
        for (StationaryObject bp : beginnerPack) {
            System.out.println(bp.getClass() + " Price: " + bp.getPrice());
        }

        System.out.println("\nSorted by price and name: ");
        Collections.sort(beginnerPack, new BpChainedComparator(
                new PriceComparator(),
                new NameComparator())
        );

        for(StationaryObject bp: beginnerPack) {
            System.out.println(bp.getClass() + " Name: " + bp.getManufacturerName() + " Price: " + bp.getPrice());
        }

    }
}
