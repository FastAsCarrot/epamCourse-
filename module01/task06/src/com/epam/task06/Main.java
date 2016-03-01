package com.epam.task06;

/**
 * Created by vrama on 29.02.2016.
 */
public class Main {
    public static void main (String ... args) {
        Notepad notepad = new Notepad();

        notepad.addRecord("Though much is taken, much abides...");
        notepad.addRecord("though we are not now that strength...");

        notepad.viewRecords();
        notepad.editRecord(20, "h");
    }

}
