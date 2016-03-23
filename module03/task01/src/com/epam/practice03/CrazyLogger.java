package com.epam.practice03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;

/**
 * Created by vrama on 22.03.2016.
 */
public class CrazyLogger {
    private StringBuilder logStorage = new StringBuilder();
    private DateFormat formatDateTime  = new SimpleDateFormat("dd-MM-YYYY: hh-mm - ");

    public void logAMessage(String msg) {
        Date date = new Date();
        logStorage.insert(logStorage.length(), formatDateTime.format(date) + msg + "\n");
    }

    public StringBuilder findInLog(String sPhrase) {
        Pattern pat = Pattern.compile("\\d{2}-\\d{2}-\\d{4}:\\s\\d{2}-\\d{2}\\s-.*" + sPhrase + ".*[^\\n]");
        Matcher mat = pat.matcher(logStorage);
        StringBuilder foundString = new StringBuilder();

        while (mat.find()) {
            foundString.append(mat.group(0));
        }

        return  foundString;
    }

    public StringBuilder getAllLogs() {
        return logStorage;
    }





}
