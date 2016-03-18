package com.epam.practice02;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by vrama on 12.03.2016.
 */
public class Main {

    public static void main (String[] args) {
        Pen pen = new Pen("Black", "Blue", "Parker");
        Pen pen2 = new Pen("White", "Yellow", "Oscorp");

        System.out.println(pen.equals(pen2));
        System.out.println(pen.equals(pen));
        System.out.println(pen.toString());
        System.out.println(pen.hashCode());
    }
}
